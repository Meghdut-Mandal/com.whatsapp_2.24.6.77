package com.facebook.http.historical;

import android.util.LruCache;

public class NetworkInfoMap {
    public static final NetworkInfoMap A01 = new NetworkInfoMap();
    public final LruCache A00 = new LruCache(20);
}
