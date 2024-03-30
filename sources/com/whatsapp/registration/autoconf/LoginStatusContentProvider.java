package com.whatsapp.registration.autoconf;

import X.AnonymousClass00C;
import X.C132916Vu;
import X.C19380ur;
import X.C19420v0;
import X.C19630wG;
import X.C19730wQ;
import X.C20800yB;
import X.C20810yC;
import X.C21000yV;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Process;
import com.whatsapp.Me;
import com.whatsapp.util.Log;

public final class LoginStatusContentProvider extends C19380ur {
    public C19730wQ A00;
    public C19630wG A01;
    public C19420v0 A02;
    public C20810yC A03;

    public Bundle call(String str, String str2, Bundle bundle) {
        String str3;
        boolean A0J;
        AnonymousClass00C.A0D(str, 0);
        Log.i("LoginStatusContentProvider/call");
        A08();
        String callingPackage = getCallingPackage();
        StringBuilder sb = new StringBuilder();
        sb.append("LoginStatusContentProvider/call/callingPackage=");
        sb.append(callingPackage);
        Log.i(sb.toString());
        if (callingPackage == null) {
            str3 = "LoginStatusContentProvider/call/null callingPackage";
        } else {
            Context context = getContext();
            if (context == null) {
                str3 = "LoginStatusContentProvider/call/null context";
            } else if (Binder.getCallingUid() == Process.myUid() || C132916Vu.A03(context, callingPackage)) {
                C19420v0 r0 = this.A02;
                if (r0 != null) {
                    if (r0.A06() >= 2) {
                        C20810yC r2 = this.A03;
                        if (r2 == null) {
                            AnonymousClass00C.A0G("abProps");
                            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                        } else if (C20800yB.A01(C21000yV.A02, r2, 4667)) {
                            if (!str.equals("login_status_check")) {
                                str3 = "LoginStatusContentProvider/call/incorrect method";
                            } else if (str2 == null) {
                                str3 = "LoginStatusContentProvider/call/null arg received";
                            } else {
                                C19730wQ r02 = this.A00;
                                if (r02 != null) {
                                    r02.A0G();
                                    Me me = r02.A00;
                                    if (me == null) {
                                        A0J = false;
                                    } else {
                                        String str4 = me.cc;
                                        String str5 = me.number;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(str4);
                                        sb2.append(str5);
                                        A0J = AnonymousClass00C.A0J(sb2.toString(), str2);
                                    }
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("LoginStatusContentProvider/call/loginStatus=");
                                    sb3.append(A0J);
                                    Log.i(sb3.toString());
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putBoolean("result", A0J);
                                    return bundle2;
                                }
                                AnonymousClass00C.A0G("meManager");
                                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                            }
                        }
                    }
                    str3 = "LoginStatusContentProvider/call/maac2 not enabled";
                } else {
                    AnonymousClass00C.A0G("waSharedPreferences");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Caller ");
                sb4.append(callingPackage);
                sb4.append(" is not trusted");
                throw new SecurityException(sb4.toString());
            }
        }
        Log.e(str3);
        return null;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public String getType(Uri uri) {
        throw new UnsupportedOperationException();
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException();
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
