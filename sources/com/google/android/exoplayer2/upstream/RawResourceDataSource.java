package com.google.android.exoplayer2.upstream;

import X.AnonymousClass000;
import android.net.Uri;

public abstract class RawResourceDataSource {
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse(AnonymousClass000.A0r("rawresource:///", AnonymousClass000.A0u(), i));
    }
}
