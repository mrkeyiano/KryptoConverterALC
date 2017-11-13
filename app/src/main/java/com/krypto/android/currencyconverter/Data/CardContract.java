package com.krypto.android.currencyconverter.Data;

import android.provider.BaseColumns;

// Created by Amoo Kayode (MR KEYIANO).

//Contract Class for the SQLite Database
public final class CardContract {

    public static abstract class CardEntry implements BaseColumns {

        public static final String _ID = BaseColumns._ID;
        public static final String TABLE_NAME = "krypto_convertion_cards";
        public static final String COLUMN_BASE_CURRENCY = "base_currency";
        public static final String COLUMN_LOCAL_CURRENCY = "local_currency";
        public static final String COLUMN_EXCHANGE_RATE = "exchange_rate";
    }

}
