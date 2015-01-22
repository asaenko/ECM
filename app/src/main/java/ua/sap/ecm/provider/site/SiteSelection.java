package ua.sap.ecm.provider.site;

import java.util.Date;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import ua.sap.ecm.provider.base.AbstractSelection;

/**
 * Selection for the {@code site} table.
 */
public class SiteSelection extends AbstractSelection<SiteSelection> {
    @Override
    public Uri uri() {
        return SiteColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @param sortOrder How to order the rows, formatted as an SQL ORDER BY clause (excluding the ORDER BY itself). Passing null will use the default sort
     *            order, which may be unordered.
     * @return A {@code SiteCursor} object, which is positioned before the first entry, or null.
     */
    public SiteCursor query(ContentResolver contentResolver, String[] projection, String sortOrder) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), sortOrder);
        if (cursor == null) return null;
        return new SiteCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, projection, null}.
     */
    public SiteCursor query(ContentResolver contentResolver, String[] projection) {
        return query(contentResolver, projection, null);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, projection, null, null}.
     */
    public SiteCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null, null);
    }


    public SiteSelection id(long... value) {
        addEquals("site." + SiteColumns._ID, toObjectArray(value));
        return this;
    }


    public SiteSelection name(String... value) {
        addEquals(SiteColumns.NAME, value);
        return this;
    }

    public SiteSelection nameNot(String... value) {
        addNotEquals(SiteColumns.NAME, value);
        return this;
    }

    public SiteSelection nameLike(String... value) {
        addLike(SiteColumns.NAME, value);
        return this;
    }

    public SiteSelection state(String... value) {
        addEquals(SiteColumns.STATE, value);
        return this;
    }

    public SiteSelection stateNot(String... value) {
        addNotEquals(SiteColumns.STATE, value);
        return this;
    }

    public SiteSelection stateLike(String... value) {
        addLike(SiteColumns.STATE, value);
        return this;
    }

    public SiteSelection region(String... value) {
        addEquals(SiteColumns.REGION, value);
        return this;
    }

    public SiteSelection regionNot(String... value) {
        addNotEquals(SiteColumns.REGION, value);
        return this;
    }

    public SiteSelection regionLike(String... value) {
        addLike(SiteColumns.REGION, value);
        return this;
    }

    public SiteSelection location(String... value) {
        addEquals(SiteColumns.LOCATION, value);
        return this;
    }

    public SiteSelection locationNot(String... value) {
        addNotEquals(SiteColumns.LOCATION, value);
        return this;
    }

    public SiteSelection locationLike(String... value) {
        addLike(SiteColumns.LOCATION, value);
        return this;
    }

    public SiteSelection address(String... value) {
        addEquals(SiteColumns.ADDRESS, value);
        return this;
    }

    public SiteSelection addressNot(String... value) {
        addNotEquals(SiteColumns.ADDRESS, value);
        return this;
    }

    public SiteSelection addressLike(String... value) {
        addLike(SiteColumns.ADDRESS, value);
        return this;
    }

    public SiteSelection tu(TU... value) {
        addEquals(SiteColumns.TU, value);
        return this;
    }

    public SiteSelection tuNot(TU... value) {
        addNotEquals(SiteColumns.TU, value);
        return this;
    }


    public SiteSelection operationCenter(String... value) {
        addEquals(SiteColumns.OPERATION_CENTER, value);
        return this;
    }

    public SiteSelection operationCenterNot(String... value) {
        addNotEquals(SiteColumns.OPERATION_CENTER, value);
        return this;
    }

    public SiteSelection operationCenterLike(String... value) {
        addLike(SiteColumns.OPERATION_CENTER, value);
        return this;
    }

    public SiteSelection description(String... value) {
        addEquals(SiteColumns.DESCRIPTION, value);
        return this;
    }

    public SiteSelection descriptionNot(String... value) {
        addNotEquals(SiteColumns.DESCRIPTION, value);
        return this;
    }

    public SiteSelection descriptionLike(String... value) {
        addLike(SiteColumns.DESCRIPTION, value);
        return this;
    }

    public SiteSelection favorite(boolean value) {
        addEquals(SiteColumns.FAVORITE, toObjectArray(value));
        return this;
    }

    public SiteSelection type(Type... value) {
        addEquals(SiteColumns.TYPE, value);
        return this;
    }

    public SiteSelection typeNot(Type... value) {
        addNotEquals(SiteColumns.TYPE, value);
        return this;
    }


    public SiteSelection longitude(Float... value) {
        addEquals(SiteColumns.LONGITUDE, value);
        return this;
    }

    public SiteSelection longitudeNot(Float... value) {
        addNotEquals(SiteColumns.LONGITUDE, value);
        return this;
    }

    public SiteSelection longitudeGt(float value) {
        addGreaterThan(SiteColumns.LONGITUDE, value);
        return this;
    }

    public SiteSelection longitudeGtEq(float value) {
        addGreaterThanOrEquals(SiteColumns.LONGITUDE, value);
        return this;
    }

    public SiteSelection longitudeLt(float value) {
        addLessThan(SiteColumns.LONGITUDE, value);
        return this;
    }

    public SiteSelection longitudeLtEq(float value) {
        addLessThanOrEquals(SiteColumns.LONGITUDE, value);
        return this;
    }

    public SiteSelection latitude(Float... value) {
        addEquals(SiteColumns.LATITUDE, value);
        return this;
    }

    public SiteSelection latitudeNot(Float... value) {
        addNotEquals(SiteColumns.LATITUDE, value);
        return this;
    }

    public SiteSelection latitudeGt(float value) {
        addGreaterThan(SiteColumns.LATITUDE, value);
        return this;
    }

    public SiteSelection latitudeGtEq(float value) {
        addGreaterThanOrEquals(SiteColumns.LATITUDE, value);
        return this;
    }

    public SiteSelection latitudeLt(float value) {
        addLessThan(SiteColumns.LATITUDE, value);
        return this;
    }

    public SiteSelection latitudeLtEq(float value) {
        addLessThanOrEquals(SiteColumns.LATITUDE, value);
        return this;
    }

    public SiteSelection birthDate(Date... value) {
        addEquals(SiteColumns.BIRTH_DATE, value);
        return this;
    }

    public SiteSelection birthDateNot(Date... value) {
        addNotEquals(SiteColumns.BIRTH_DATE, value);
        return this;
    }

    public SiteSelection birthDate(Long... value) {
        addEquals(SiteColumns.BIRTH_DATE, value);
        return this;
    }

    public SiteSelection birthDateAfter(Date value) {
        addGreaterThan(SiteColumns.BIRTH_DATE, value);
        return this;
    }

    public SiteSelection birthDateAfterEq(Date value) {
        addGreaterThanOrEquals(SiteColumns.BIRTH_DATE, value);
        return this;
    }

    public SiteSelection birthDateBefore(Date value) {
        addLessThan(SiteColumns.BIRTH_DATE, value);
        return this;
    }

    public SiteSelection birthDateBeforeEq(Date value) {
        addLessThanOrEquals(SiteColumns.BIRTH_DATE, value);
        return this;
    }
}
