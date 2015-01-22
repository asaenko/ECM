package ua.sap.ecm.provider.site;

import java.util.Date;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import ua.sap.ecm.provider.base.AbstractCursor;

/**
 * Cursor wrapper for the {@code site} table.
 */
public class SiteCursor extends AbstractCursor implements SiteModel {
    public SiteCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * The  name of site.
     * Cannot be {@code null}.
     */
    @NonNull
    public String getName() {
        String res = getStringOrNull(SiteColumns.NAME);
        if (res == null)
            throw new NullPointerException("The value of 'name' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code state} value.
     * Cannot be {@code null}.
     */
    @NonNull
    public String getState() {
        String res = getStringOrNull(SiteColumns.STATE);
        if (res == null)
            throw new NullPointerException("The value of 'state' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code region} value.
     * Cannot be {@code null}.
     */
    @NonNull
    public String getRegion() {
        String res = getStringOrNull(SiteColumns.REGION);
        if (res == null)
            throw new NullPointerException("The value of 'region' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code location} value.
     * Cannot be {@code null}.
     */
    @NonNull
    public String getLocation() {
        String res = getStringOrNull(SiteColumns.LOCATION);
        if (res == null)
            throw new NullPointerException("The value of 'location' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code address} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getAddress() {
        return getStringOrNull(SiteColumns.ADDRESS);
    }

    /**
     * Get the {@code tu} value.
     * Cannot be {@code null}.
     */
    @NonNull
    public TU getTu() {
        Integer intValue = getIntegerOrNull(SiteColumns.TU);
        if (intValue == null)
            throw new NullPointerException("The value of 'tu' in the database was null, which is not allowed according to the model definition");
        return TU.values()[intValue];
    }

    /**
     * Get the {@code operation_center} value.
     * Cannot be {@code null}.
     */
    @NonNull
    public String getOperationCenter() {
        String res = getStringOrNull(SiteColumns.OPERATION_CENTER);
        if (res == null)
            throw new NullPointerException("The value of 'operation_center' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code description} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getDescription() {
        return getStringOrNull(SiteColumns.DESCRIPTION);
    }

    /**
     * Get the {@code favorite} value.
     */
    public boolean getFavorite() {
        return getBooleanOrNull(SiteColumns.FAVORITE);
    }

    /**
     * Get the {@code type} value.
     * Cannot be {@code null}.
     */
    @NonNull
    public Type getType() {
        Integer intValue = getIntegerOrNull(SiteColumns.TYPE);
        if (intValue == null)
            throw new NullPointerException("The value of 'type' in the database was null, which is not allowed according to the model definition");
        return Type.values()[intValue];
    }

    /**
     * Get the {@code longitude} value.
     * Can be {@code null}.
     */
    @Nullable
    public Float getLongitude() {
        return getFloatOrNull(SiteColumns.LONGITUDE);
    }

    /**
     * Get the {@code latitude} value.
     * Can be {@code null}.
     */
    @Nullable
    public Float getLatitude() {
        return getFloatOrNull(SiteColumns.LATITUDE);
    }

    /**
     * Get the {@code birth_date} value.
     * Can be {@code null}.
     */
    @Nullable
    public Date getBirthDate() {
        return getDateOrNull(SiteColumns.BIRTH_DATE);
    }
}
