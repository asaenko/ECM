package ua.sap.ecm.provider.site;

import ua.sap.ecm.provider.base.BaseModel;

import java.util.Date;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Site.
 */
public interface SiteModel extends BaseModel {

    /**
     * The  name of site.
     * Cannot be {@code null}.
     */
    @NonNull
    String getName();

    /**
     * Get the {@code state} value.
     * Cannot be {@code null}.
     */
    @NonNull
    String getState();

    /**
     * Get the {@code region} value.
     * Cannot be {@code null}.
     */
    @NonNull
    String getRegion();

    /**
     * Get the {@code location} value.
     * Cannot be {@code null}.
     */
    @NonNull
    String getLocation();

    /**
     * Get the {@code address} value.
     * Can be {@code null}.
     */
    @Nullable
    String getAddress();

    /**
     * Get the {@code tu} value.
     * Cannot be {@code null}.
     */
    @NonNull
    TU getTu();

    /**
     * Get the {@code operation_center} value.
     * Cannot be {@code null}.
     */
    @NonNull
    String getOperationCenter();

    /**
     * Get the {@code description} value.
     * Can be {@code null}.
     */
    @Nullable
    String getDescription();

    /**
     * Get the {@code favorite} value.
     */
    boolean getFavorite();

    /**
     * Get the {@code type} value.
     * Cannot be {@code null}.
     */
    @NonNull
    Type getType();

    /**
     * Get the {@code longitude} value.
     * Can be {@code null}.
     */
    @Nullable
    Float getLongitude();

    /**
     * Get the {@code latitude} value.
     * Can be {@code null}.
     */
    @Nullable
    Float getLatitude();

    /**
     * Get the {@code birth_date} value.
     * Can be {@code null}.
     */
    @Nullable
    Date getBirthDate();
}
