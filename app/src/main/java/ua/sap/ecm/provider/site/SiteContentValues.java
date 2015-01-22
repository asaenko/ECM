package ua.sap.ecm.provider.site;

import java.util.Date;

import android.content.ContentResolver;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import ua.sap.ecm.provider.base.AbstractContentValues;

/**
 * Content values wrapper for the {@code site} table.
 */
public class SiteContentValues extends AbstractContentValues {
    @Override
    public Uri uri() {
        return SiteColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable SiteSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * The  name of site.
     */
    public SiteContentValues putName(@NonNull String value) {
        if (value == null) throw new IllegalArgumentException("name must not be null");
        mContentValues.put(SiteColumns.NAME, value);
        return this;
    }



    public SiteContentValues putState(@NonNull String value) {
        if (value == null) throw new IllegalArgumentException("state must not be null");
        mContentValues.put(SiteColumns.STATE, value);
        return this;
    }



    public SiteContentValues putRegion(@NonNull String value) {
        if (value == null) throw new IllegalArgumentException("region must not be null");
        mContentValues.put(SiteColumns.REGION, value);
        return this;
    }



    public SiteContentValues putLocation(@NonNull String value) {
        if (value == null) throw new IllegalArgumentException("location must not be null");
        mContentValues.put(SiteColumns.LOCATION, value);
        return this;
    }



    public SiteContentValues putAddress(@Nullable String value) {
        mContentValues.put(SiteColumns.ADDRESS, value);
        return this;
    }

    public SiteContentValues putAddressNull() {
        mContentValues.putNull(SiteColumns.ADDRESS);
        return this;
    }


    public SiteContentValues putTu(@NonNull TU value) {
        if (value == null) throw new IllegalArgumentException("tu must not be null");
        mContentValues.put(SiteColumns.TU, value.ordinal());
        return this;
    }



    public SiteContentValues putOperationCenter(@NonNull String value) {
        if (value == null) throw new IllegalArgumentException("operationCenter must not be null");
        mContentValues.put(SiteColumns.OPERATION_CENTER, value);
        return this;
    }



    public SiteContentValues putDescription(@Nullable String value) {
        mContentValues.put(SiteColumns.DESCRIPTION, value);
        return this;
    }

    public SiteContentValues putDescriptionNull() {
        mContentValues.putNull(SiteColumns.DESCRIPTION);
        return this;
    }


    public SiteContentValues putFavorite(boolean value) {
        mContentValues.put(SiteColumns.FAVORITE, value);
        return this;
    }



    public SiteContentValues putType(@NonNull Type value) {
        if (value == null) throw new IllegalArgumentException("type must not be null");
        mContentValues.put(SiteColumns.TYPE, value.ordinal());
        return this;
    }



    public SiteContentValues putLongitude(@Nullable Float value) {
        mContentValues.put(SiteColumns.LONGITUDE, value);
        return this;
    }

    public SiteContentValues putLongitudeNull() {
        mContentValues.putNull(SiteColumns.LONGITUDE);
        return this;
    }


    public SiteContentValues putLatitude(@Nullable Float value) {
        mContentValues.put(SiteColumns.LATITUDE, value);
        return this;
    }

    public SiteContentValues putLatitudeNull() {
        mContentValues.putNull(SiteColumns.LATITUDE);
        return this;
    }


    public SiteContentValues putBirthDate(@Nullable Date value) {
        mContentValues.put(SiteColumns.BIRTH_DATE, value == null ? null : value.getTime());
        return this;
    }

    public SiteContentValues putBirthDateNull() {
        mContentValues.putNull(SiteColumns.BIRTH_DATE);
        return this;
    }

    public SiteContentValues putBirthDate(@Nullable Long value) {
        mContentValues.put(SiteColumns.BIRTH_DATE, value);
        return this;
    }

}
