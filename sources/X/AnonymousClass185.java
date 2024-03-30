package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.185  reason: invalid class name */
public class AnonymousClass185 {
    public final C21100yf A00;
    public final C229516p A01;
    public final AnonymousClass16I A02;
    public final C235418w A03 = new C235418w();
    public final AnonymousClass189 A04;
    public final AnonymousClass187 A05;
    public final Object A06 = new Object();
    public final Map A07 = Collections.synchronizedMap(new HashMap());
    public final Handler A08 = new Handler(Looper.getMainLooper());
    public final C19730wQ A09;
    public final AnonymousClass16D A0A;
    public final Set A0B;

    public static boolean A00(AnonymousClass185 r16, UserJid userJid, C80113ur r18, byte[] bArr, int i) {
        Long l;
        String str;
        Integer num;
        C1495671s A002;
        ArrayList A0Q;
        String str2;
        boolean z = false;
        UserJid userJid2 = userJid;
        if (userJid == null) {
            return false;
        }
        AnonymousClass185 r5 = r16;
        try {
            C99924uB r1 = (C99924uB) C170918Hz.A08(C99924uB.DEFAULT_INSTANCE, bArr);
            if ((r1.bitField0_ & 1) != 0) {
                C80113ur r7 = null;
                AnonymousClass8RK r9 = (AnonymousClass8RK) C170918Hz.A08(AnonymousClass8RK.DEFAULT_INSTANCE, r1.details_.A06());
                if (r9 != null) {
                    synchronized (r5.A06) {
                        r5.A0A.A0D(userJid2);
                        AnonymousClass3L0 A022 = r5.A02(userJid2);
                        StringBuilder sb = new StringBuilder();
                        sb.append("VerifiedNameManager/storeVerifiedNameCert, userjid: ");
                        sb.append(userJid2);
                        sb.append(", old serial: ");
                        if (A022 == null) {
                            l = null;
                        } else {
                            l = Long.valueOf(A022.A05);
                        }
                        sb.append(l);
                        sb.append(", issuer: ");
                        if (A022 == null) {
                            str = null;
                        } else {
                            str = A022.A07;
                        }
                        sb.append(str);
                        sb.append(", vlevel: ");
                        if (A022 == null) {
                            num = null;
                        } else {
                            num = Integer.valueOf(A022.A03);
                        }
                        sb.append(num);
                        sb.append(", privacyState: ");
                        if (A022 != null) {
                            r7 = A022.A00();
                        }
                        sb.append(r7);
                        Log.i(sb.toString());
                        C80113ur r8 = r18;
                        if (A022 == null || A022.A05 != r9.serial_ || A022.A02 > 0) {
                            ArrayList arrayList = new ArrayList();
                            for (AnonymousClass8QK r6 : r9.localizedNames_) {
                                if (!TextUtils.isEmpty(r6.lg_)) {
                                    String str3 = r6.lg_;
                                    if (!TextUtils.isEmpty(r6.lc_)) {
                                        str2 = r6.lc_;
                                    } else {
                                        str2 = "";
                                    }
                                    arrayList.add(new AnonymousClass00I(new Locale(str3, str2), r6.verifiedName_));
                                }
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("VerifiedNameManager/storeVerifiedNameCert, new or updated cert. jid: ");
                            sb2.append(userJid2);
                            sb2.append("new serial:");
                            sb2.append(r9.serial_);
                            sb2.append(", issuer: ");
                            sb2.append(r9.issuer_);
                            sb2.append(", vlevel: ");
                            sb2.append(i);
                            sb2.append(", privacyState: ");
                            sb2.append(r8);
                            Log.i(sb2.toString());
                            C229516p r62 = r5.A01;
                            long j = r9.serial_;
                            String str4 = r9.issuer_;
                            String str5 = r9.verifiedName_;
                            try {
                                AnonymousClass1M0 A042 = r62.A00.A04();
                                try {
                                    A002 = A042.A00();
                                    C229516p.A0A(r62, A002, userJid2);
                                    String rawString = userJid2.getRawString();
                                    boolean z2 = false;
                                    int i2 = 7;
                                    if (r8 != null) {
                                        z2 = true;
                                        i2 = 10;
                                    }
                                    ContentValues contentValues = new ContentValues(i2);
                                    contentValues.put("jid", rawString);
                                    contentValues.put("serial", Long.valueOf(j));
                                    contentValues.put("issuer", str4);
                                    contentValues.put("verified_name", str5);
                                    contentValues.put("verified_level", Integer.valueOf(i));
                                    contentValues.put("cert_blob", (byte[]) null);
                                    contentValues.put("identity_unconfirmed_since", (Long) null);
                                    if (z2) {
                                        contentValues.put("host_storage", Integer.valueOf(r8.hostStorage));
                                        contentValues.put("actual_actors", Integer.valueOf(r8.actualActors));
                                        contentValues.put("privacy_mode_ts", Long.valueOf(r8.privacyModeTs));
                                    }
                                    C229416o.A00(contentValues, A042, "wa_vnames");
                                    contentValues.clear();
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        AnonymousClass00I r14 = (AnonymousClass00I) it.next();
                                        contentValues.put("jid", rawString);
                                        Locale locale = (Locale) r14.A00;
                                        C18740tg.A06(locale);
                                        contentValues.put("lg", locale.getLanguage());
                                        contentValues.put("lc", locale.getCountry());
                                        contentValues.put("verified_name", (String) r14.A01);
                                        C229416o.A00(contentValues, A042, "wa_vnames_localized");
                                    }
                                    A0Q = r62.A0Q(userJid2);
                                    A002.A00();
                                    A002.close();
                                    A042.close();
                                } catch (Throwable th) {
                                    A042.close();
                                    throw th;
                                }
                            } catch (IllegalArgumentException e) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("contact-mgr-db/unable to store vname details ");
                                sb3.append(userJid2);
                                C18740tg.A08(sb3.toString(), e);
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            if (A0Q != null && !A0Q.isEmpty()) {
                                ((AnonymousClass2ZF) r62.A08.get()).A00(A0Q);
                            }
                            z = true;
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("VerifiedNameManager/storeVerifiedNameCert, cert unchanged but level or privacy changed, jid: ");
                            sb4.append(userJid2);
                            Log.i(sb4.toString());
                            z = r5.A05(userJid2, r8, i, false);
                        }
                    }
                    r5.A07.put(userJid2, Long.valueOf(System.currentTimeMillis()));
                    C235418w r12 = r5.A03;
                    new C1256660u(userJid2);
                    r12.A00();
                    return z;
                }
            }
        } catch (AnonymousClass186 e2) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("VerifiedNameManager/storeVerifiedNameCert, vname invalidproto for jid: ");
            sb5.append(userJid2);
            Log.e(sb5.toString(), e2);
        } catch (IllegalArgumentException e3) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("VerifiedNameManager/storeVerifiedNameCert vname failed to get identity entry for jid = ");
            sb6.append(userJid2);
            Log.e(sb6.toString(), e3);
        } catch (Throwable th3) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append("VerifiedNameManager/storeVerifiedNameCert, vname certificate details could no be found or validated for jid ");
            sb7.append(userJid2);
            Log.w(sb7.toString());
            r5.A07.put(userJid2, Long.valueOf(System.currentTimeMillis()));
            C235418w r13 = r5.A03;
            new C1256660u(userJid2);
            r13.A00();
            throw th3;
        }
        StringBuilder sb8 = new StringBuilder();
        sb8.append("VerifiedNameManager/storeVerifiedNameCert, vname certificate details could no be found or validated for jid ");
        sb8.append(userJid2);
        Log.w(sb8.toString());
        r5.A07.put(userJid2, Long.valueOf(System.currentTimeMillis()));
        C235418w r122 = r5.A03;
        new C1256660u(userJid2);
        r122.A00();
        return z;
        throw th;
    }

    public AnonymousClass3L0 A02(UserJid userJid) {
        Integer num = null;
        AnonymousClass3L0 A012 = A01(userJid);
        StringBuilder sb = new StringBuilder();
        sb.append("VerifiedNameManager/getVerifiedNameDeprecated, jid: ");
        sb.append(userJid);
        sb.append(", vlevel:");
        if (A012 != null) {
            num = Integer.valueOf(A012.A03);
        }
        sb.append(num);
        Log.i(sb.toString());
        return A012;
    }

    public AnonymousClass3L0 A01(UserJid userJid) {
        if (this.A09.A0M(userJid)) {
            return this.A01.A0N(userJid);
        }
        if (userJid != null) {
            return this.A0A.A0D(userJid).A0E;
        }
        return null;
    }

    public void A03(UserJid userJid) {
        C1495671s B1k;
        ArrayList A0Q;
        StringBuilder sb = new StringBuilder();
        sb.append("VerifiedNameManager/clearVerifiedName, userjid: ");
        sb.append(userJid);
        sb.append(" UI change");
        Log.i(sb.toString());
        synchronized (this.A06) {
            C229516p r5 = this.A01;
            if (userJid != null) {
                try {
                    AnonymousClass1M0 A042 = r5.A00.A04();
                    try {
                        B1k = A042.B1k();
                        C229516p.A0A(r5, B1k, userJid);
                        A0Q = r5.A0Q(userJid);
                        B1k.A00();
                        B1k.close();
                        A042.close();
                    } catch (Throwable th) {
                        A042.close();
                        throw th;
                    }
                } catch (IllegalArgumentException e) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("contact-mgr-db/unable to delete vname details ");
                    sb2.append(userJid);
                    C18740tg.A08(sb2.toString(), e);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                if (A0Q != null && !A0Q.isEmpty()) {
                    ((AnonymousClass2ZF) r5.A08.get()).A00(A0Q);
                }
            }
        }
        this.A07.remove(userJid);
        this.A0A.A0N();
        this.A08.post(new C35651j2(this, userJid, 46));
        return;
        throw th;
    }

    public boolean A04(UserJid userJid) {
        AnonymousClass141 A082;
        if (userJid == null || (A082 = this.A0A.A08(userJid)) == null) {
            return false;
        }
        return A082.A0F();
    }

    public boolean A05(UserJid userJid, C80113ur r14, int i, boolean z) {
        Object obj;
        boolean z2;
        int i2;
        long j;
        AnonymousClass1M0 A042;
        StringBuilder sb = new StringBuilder();
        sb.append("VerifiedNameManager/updateContactBizField, userjid: ");
        sb.append(userJid);
        sb.append("new verifiedLevel: ");
        sb.append(i);
        sb.append(" privacyMode: ");
        if (r14 == null) {
            obj = "null";
        } else {
            obj = r14;
        }
        sb.append(obj);
        Log.i(sb.toString());
        synchronized (this.A06) {
            AnonymousClass3L0 A022 = A02(userJid);
            z2 = false;
            if (A022 != null) {
                i2 = A022.A03;
            } else {
                i2 = 0;
            }
            if (A022 != null) {
                j = A022.A04;
            } else {
                j = 0;
            }
            ContentValues contentValues = new ContentValues();
            if (i2 != i) {
                contentValues.put("verified_level", Integer.valueOf(i));
            }
            if (r14 != null) {
                long j2 = r14.privacyModeTs;
                if (j < j2 || (j > 0 && j2 == 0)) {
                    contentValues.put("host_storage", Integer.valueOf(r14.hostStorage));
                    contentValues.put("actual_actors", Integer.valueOf(r14.actualActors));
                    contentValues.put("privacy_mode_ts", Long.valueOf(r14.privacyModeTs));
                }
            }
            if (contentValues.size() > 0) {
                z2 = true;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("VerifiedNameManager/updateContactBizField, userjid: ");
            sb2.append(userJid);
            sb2.append(", isUpdate: ");
            sb2.append(z2);
            Log.i(sb2.toString());
            if (z2) {
                C229516p r3 = this.A01;
                try {
                    A042 = r3.A00.A04();
                    C229416o.A01(contentValues, A042, "wa_vnames", "jid = ?", new String[]{AnonymousClass143.A03(userJid)});
                    A042.close();
                } catch (IllegalArgumentException e) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("wadbhelper/update-multi-fields/unable to update fields");
                    sb3.append(userJid);
                    sb3.append(", ");
                    sb3.append(contentValues.toString());
                    C18740tg.A08(sb3.toString(), e);
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
                ((AnonymousClass2ZF) r3.A08.get()).A00(r3.A0Q(userJid));
                if (z && i2 != i) {
                    this.A0A.A0N();
                    Iterator it = this.A0B.iterator();
                    if (it.hasNext()) {
                        it.next();
                        throw new NullPointerException("onLevelChanged");
                    }
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("VerifiedNameManager/updateContactBizField, ui change, userjid: ");
                sb4.append(userJid);
                Log.i(sb4.toString());
                this.A08.post(new C35651j2(this, userJid, 48));
            }
        }
        return z2;
        throw th;
    }

    public boolean A06(UserJid userJid, C80113ur r7, byte[] bArr, int i) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("VerifiedNameManager/storeAndConfirmVerifiedNameCert, jid: ");
        sb.append(userJid);
        sb.append(", new vlevel: ");
        sb.append(i);
        Log.i(sb.toString());
        synchronized (this.A06) {
            A00(this, userJid, r7, bArr, i);
            AnonymousClass3L0 A022 = A02(userJid);
            C18740tg.A06(A022);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("VerifiedNameManager/storeAndConfirmVerifiedNameCert, jid: ");
            sb2.append(userJid);
            sb2.append(", verifiedName.identityUnconfirmedSince: ");
            int i2 = A022.A02;
            sb2.append(i2);
            Log.i(sb2.toString());
            if (i2 == 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("VerifiedNameManager/storeAndConfirmVerifiedNameCert, updating UI, userjid: ");
                sb3.append(userJid);
                Log.i(sb3.toString());
                this.A08.post(new C35651j2(this, userJid, 47));
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public byte[] A07(UserJid userJid) {
        Cursor A032;
        AnonymousClass1M0 A033 = this.A01.A00.get();
        try {
            A032 = C229416o.A03(A033, "SELECT cert_blob FROM wa_vnames WHERE jid = ?", "CONTACT_VNAMES_CERT_BLOB", new String[]{userJid.getRawString()});
            if (A032.isClosed() || !A032.moveToNext()) {
                A032.close();
                A033.close();
                return null;
            }
            byte[] blob = A032.getBlob(A032.getColumnIndexOrThrow("cert_blob"));
            A032.close();
            A033.close();
            return blob;
        } catch (Throwable th) {
            try {
                A033.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass185(C19730wQ r3, C21100yf r4, AnonymousClass16D r5, C229516p r6, AnonymousClass16I r7, AnonymousClass189 r8, AnonymousClass187 r9, Set set) {
        this.A09 = r3;
        this.A00 = r4;
        this.A0A = r5;
        this.A02 = r7;
        this.A04 = r8;
        this.A01 = r6;
        this.A05 = r9;
        this.A0B = set;
    }
}
