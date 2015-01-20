package ua.sap.ecm.adapter;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;

/**
 * Created by asaenko on 19.01.2015.
 */
public class SyncAdapter extends AbstractThreadedSyncAdapter {

    private static final String AUTHORITY = "ua.sap.ecm.provider";
    private static final String PREFIX = "content://" + AUTHORITY + "/";

    public SyncAdapter(Context context, boolean autoInitialize) {
        super(context, autoInitialize);
    }

    @Override
    public void onPerformSync(Account account, Bundle extras, String authority, ContentProviderClient provider, SyncResult syncResult) {

    }
}
