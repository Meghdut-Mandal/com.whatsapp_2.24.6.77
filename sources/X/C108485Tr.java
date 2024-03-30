package X;

/* renamed from: X.5Tr  reason: invalid class name and case insensitive filesystem */
public enum C108485Tr {
    FACEBOOK("com.facebook.auth.login", "com.facebook.katana", 0),
    FACEBOOK_LITE("com.facebook.lite", "com.facebook.lite", 2),
    INSTAGRAM("www.instagram.com", "com.instagram.android", 3),
    MESSENGER("com.facebook.messenger", "com.facebook.orca", 5);
    
    public final String mAccountManagerType;
    public final String mPackageName;
    public final String mPrefPrefix;

    /* access modifiers changed from: public */
    C108485Tr(String str, String str2, int i) {
        this.mPrefPrefix = r2;
        this.mAccountManagerType = str;
        this.mPackageName = str2;
    }
}
