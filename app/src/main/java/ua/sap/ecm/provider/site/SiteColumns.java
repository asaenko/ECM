package ua.sap.ecm.provider.site;

import android.net.Uri;
import android.provider.BaseColumns;

import ua.sap.ecm.provider.EcmContentProvider;
import ua.sap.ecm.provider.site.SiteColumns;

/**
 * Site.
 */
public class SiteColumns implements BaseColumns {
    public static final String TABLE_NAME = "site";
    public static final Uri CONTENT_URI = Uri.parse(EcmContentProvider.CONTENT_URI_BASE + "/" + TABLE_NAME);

    /**
     * Primary key.
     */
    public static final String _ID = new String(BaseColumns._ID);

    /**
     * The  name of site.
     */
    public static final String NAME = "name";

    public static final String STATE = "state";

    public static final String REGION = "region";

    public static final String LOCATION = "location";

    public static final String ADDRESS = "address";

    public static final String TU = "tu";

    public static final String OPERATION_CENTER = "operation_center";

    public static final String DESCRIPTION = "description";

    public static final String FAVORITE = "favorite";

    public static final String TYPE = "type";

    public static final String LONGITUDE = "longitude";

    public static final String LATITUDE = "latitude";

    public static final String BIRTH_DATE = "birth_date";


    public static final String DEFAULT_ORDER = TABLE_NAME + "." +_ID;

    // @formatter:off
    public static final String[] ALL_COLUMNS = new String[] {
            _ID,
            NAME,
            STATE,
            REGION,
            LOCATION,
            ADDRESS,
            TU,
            OPERATION_CENTER,
            DESCRIPTION,
            FAVORITE,
            TYPE,
            LONGITUDE,
            LATITUDE,
            BIRTH_DATE
    };
    // @formatter:on

    public static boolean hasColumns(String[] projection) {
        if (projection == null) return true;
        for (String c : projection) {
            if (c == NAME || c.contains("." + NAME)) return true;
            if (c == STATE || c.contains("." + STATE)) return true;
            if (c == REGION || c.contains("." + REGION)) return true;
            if (c == LOCATION || c.contains("." + LOCATION)) return true;
            if (c == ADDRESS || c.contains("." + ADDRESS)) return true;
            if (c == TU || c.contains("." + TU)) return true;
            if (c == OPERATION_CENTER || c.contains("." + OPERATION_CENTER)) return true;
            if (c == DESCRIPTION || c.contains("." + DESCRIPTION)) return true;
            if (c == FAVORITE || c.contains("." + FAVORITE)) return true;
            if (c == TYPE || c.contains("." + TYPE)) return true;
            if (c == LONGITUDE || c.contains("." + LONGITUDE)) return true;
            if (c == LATITUDE || c.contains("." + LATITUDE)) return true;
            if (c == BIRTH_DATE || c.contains("." + BIRTH_DATE)) return true;
        }
        return false;
    }

}
