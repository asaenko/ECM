package ua.sap.ecm.provider;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.DefaultDatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;

import ua.sap.ecm.provider.BuildConfig;
import ua.sap.ecm.provider.site.SiteColumns;

public class EcmSQLiteOpenHelper extends SQLiteOpenHelper {
    private static final String TAG = EcmSQLiteOpenHelper.class.getSimpleName();

    public static final String DATABASE_FILE_NAME = "ecm.db";
    private static final int DATABASE_VERSION = 1;
    private static EcmSQLiteOpenHelper sInstance;
    private final Context mContext;
    private final EcmSQLiteOpenHelperCallbacks mOpenHelperCallbacks;

    // @formatter:off
    private static final String SQL_CREATE_TABLE_SITE = "CREATE TABLE IF NOT EXISTS "
            + SiteColumns.TABLE_NAME + " ( "
            + SiteColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + SiteColumns.NAME + " TEXT NOT NULL, "
            + SiteColumns.STATE + " TEXT NOT NULL, "
            + SiteColumns.REGION + " TEXT NOT NULL, "
            + SiteColumns.LOCATION + " TEXT NOT NULL, "
            + SiteColumns.ADDRESS + " TEXT, "
            + SiteColumns.TU + " INTEGER NOT NULL, "
            + SiteColumns.OPERATION_CENTER + " TEXT NOT NULL, "
            + SiteColumns.DESCRIPTION + " TEXT, "
            + SiteColumns.FAVORITE + " INTEGER NOT NULL DEFAULT '0', "
            + SiteColumns.TYPE + " INTEGER NOT NULL, "
            + SiteColumns.LONGITUDE + " REAL, "
            + SiteColumns.LATITUDE + " REAL, "
            + SiteColumns.BIRTH_DATE + " INTEGER "
            + " );";

    private static final String SQL_CREATE_INDEX_SITE_NAME = "CREATE INDEX IDX_SITE_NAME "
            + " ON " + SiteColumns.TABLE_NAME + " ( " + SiteColumns.NAME + " );";

    // @formatter:on

    public static EcmSQLiteOpenHelper getInstance(Context context) {
        // Use the application context, which will ensure that you
        // don't accidentally leak an Activity's context.
        // See this article for more information: http://bit.ly/6LRzfx
        if (sInstance == null) {
            sInstance = newInstance(context.getApplicationContext());
        }
        return sInstance;
    }

    private static EcmSQLiteOpenHelper newInstance(Context context) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB) {
            return newInstancePreHoneycomb(context);
        }
        return newInstancePostHoneycomb(context);
    }


    /*
     * Pre Honeycomb.
     */

    private static EcmSQLiteOpenHelper newInstancePreHoneycomb(Context context) {
        return new EcmSQLiteOpenHelper(context, DATABASE_FILE_NAME, null, DATABASE_VERSION);
    }

    private EcmSQLiteOpenHelper(Context context, String name, CursorFactory factory, int version) {
        super(context, name, factory, version);
        mContext = context;
        mOpenHelperCallbacks = new EcmSQLiteOpenHelperCallbacks();
    }


    /*
     * Post Honeycomb.
     */

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private static EcmSQLiteOpenHelper newInstancePostHoneycomb(Context context) {
        return new EcmSQLiteOpenHelper(context, DATABASE_FILE_NAME, null, DATABASE_VERSION, new DefaultDatabaseErrorHandler());
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private EcmSQLiteOpenHelper(Context context, String name, CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
        mContext = context;
        mOpenHelperCallbacks = new EcmSQLiteOpenHelperCallbacks();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        if (BuildConfig.DEBUG) Log.d(TAG, "onCreate");
        mOpenHelperCallbacks.onPreCreate(mContext, db);
        db.execSQL(SQL_CREATE_TABLE_SITE);
        db.execSQL(SQL_CREATE_INDEX_SITE_NAME);
        mOpenHelperCallbacks.onPostCreate(mContext, db);
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        if (!db.isReadOnly()) {
            setForeignKeyConstraintsEnabled(db);
        }
        mOpenHelperCallbacks.onOpen(mContext, db);
    }

    private void setForeignKeyConstraintsEnabled(SQLiteDatabase db) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) {
            setForeignKeyConstraintsEnabledPreJellyBean(db);
        } else {
            setForeignKeyConstraintsEnabledPostJellyBean(db);
        }
    }

    private void setForeignKeyConstraintsEnabledPreJellyBean(SQLiteDatabase db) {
        db.execSQL("PRAGMA foreign_keys=ON;");
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void setForeignKeyConstraintsEnabledPostJellyBean(SQLiteDatabase db) {
        db.setForeignKeyConstraintsEnabled(true);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        mOpenHelperCallbacks.onUpgrade(mContext, db, oldVersion, newVersion);
    }
}
