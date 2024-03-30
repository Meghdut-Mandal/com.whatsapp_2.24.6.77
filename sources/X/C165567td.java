package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.msys.mci.DefaultCrypto;
import com.google.android.recaptcha.internal.zzcj;
import com.google.android.recaptcha.internal.zzhc;
import com.google.android.recaptcha.internal.zzhd;
import com.google.android.recaptcha.internal.zzpq;
import com.whatsapp.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.payments.ui.PaymentSettingsFragment;
import com.whatsapp.suggestions.SuggestionsEngine;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.lang.reflect.Field;
import java.security.cert.CertPath;
import java.security.cert.X509Certificate;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.json.JSONObject;

/* renamed from: X.7td  reason: invalid class name and case insensitive filesystem */
public abstract class C165567td {
    public static long A05(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static long A06(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static C131606Ps A0F() {
        return new C131606Ps((String) null, new C131606Ps[0]);
    }

    public static String A0a(JSONObject jSONObject) {
        AnonymousClass00C.A0D(jSONObject, 0);
        String string = jSONObject.getString("variable");
        AnonymousClass00C.A08(string);
        return string;
    }

    public static ArrayList A0c(Object obj, Object[] objArr) {
        objArr[1] = obj;
        return new ArrayList(Arrays.asList(objArr));
    }

    public static void A0l(IBinder iBinder, Parcel parcel, int i) {
        iBinder.transact(i, parcel, (Parcel) null, 1);
    }

    public static void A0m(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(1);
    }

    public static void A14(Jid jid, Object obj, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = jid.getRawString();
    }

    public static void A1I(Class cls) {
        cls.getMethod("objectFieldOffset", new Class[]{Field.class});
        Class<Class> cls2 = Class.class;
        cls.getMethod("arrayBaseOffset", new Class[]{cls2});
        cls.getMethod("arrayIndexScale", new Class[]{cls2});
    }

    public static void A1K(Object obj, Object obj2, Object obj3) {
        AnonymousClass00C.A0D(obj, 0);
        AnonymousClass00C.A0D(obj2, 1);
        AnonymousClass00C.A0D(obj3, 2);
    }

    public static void A1V(Object[] objArr) {
        objArr[0] = "zzd";
        objArr[1] = "zze";
    }

    public static void A1W(Object[] objArr) {
        objArr[0] = "zzd";
        objArr[1] = "zze";
        objArr[2] = "zzf";
        objArr[3] = "zzg";
        objArr[4] = "zzh";
    }

    public static void A1X(Object[] objArr, int i, int i2) {
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
    }

    public static boolean A1Z(Parcel parcel) {
        return parcel.readByte() == 1;
    }

    public static boolean A1b(Class cls, Object obj) {
        Class<byte[]> cls2 = byte[].class;
        Class cls3 = Boolean.TYPE;
        cls.getMethod("peekLong", new Class[]{obj, cls3});
        cls.getMethod("pokeLong", new Class[]{obj, Long.TYPE, cls3});
        Class cls4 = Integer.TYPE;
        cls.getMethod("pokeInt", new Class[]{obj, cls4, cls3});
        cls.getMethod("peekInt", new Class[]{obj, cls3});
        cls.getMethod("pokeByte", new Class[]{obj, Byte.TYPE});
        cls.getMethod("peekByte", new Class[]{obj});
        cls.getMethod("pokeByteArray", new Class[]{obj, cls2, cls4, cls4});
        cls.getMethod("peekByteArray", new Class[]{obj, cls2, cls4, cls4});
        return true;
    }

    public static int A00(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        if ((i & -268435456) == 0) {
            return 4;
        }
        return 5;
    }

    public static int A01(long j, int i) {
        return i >>> ((int) ((j & 3) << 3));
    }

    public static int A02(zzhd zzhd) {
        zzhc zzhc = zzhd.zza;
        return zzhc.zzd() + zzhc.zzn();
    }

    public static int A04(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long A09(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) << 8) & 65280);
    }

    public static long A0A(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static C52502pX A0C(C63573Ko r1, String str, Object[] objArr) {
        r1.A02 = str;
        C52502pX r2 = C52502pX.INTEGER;
        r1.A00 = r2;
        r1.A0t();
        objArr[0] = r1.A0r();
        return r2;
    }

    public static C21240yt A0E(String str, byte b) {
        return new C21240yt(new SSLException(str), b);
    }

    public static IOException A0L(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid byte order: ");
        sb.append(obj);
        return new IOException(sb.toString());
    }

    public static Object A0S(zzcj zzcj, zzpq[] zzpqArr) {
        return zzcj.zze.zza(zzpqArr[0]);
    }

    public static String A0Z(StringBuilder sb, int i, int i2) {
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public static StringBuilder A0b(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(new C019308f(obj.getClass()).BHa());
        return sb;
    }

    public static ArrayList A0d(Object obj, Object[] objArr, int i) {
        objArr[i] = obj;
        return new ArrayList(Arrays.asList(objArr));
    }

    public static Set A0g(Object obj, Object[] objArr, int i) {
        objArr[i] = obj;
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    public static AnonymousClass122 A0i(String str) {
        return new AnonymousClass122(str).A0H();
    }

    public static void A0o(C19460v5 r1, C27111My r2, C32581dr r3, C18800tq r4, ConversationsFragment conversationsFragment) {
        conversationsFragment.A0M = r1;
        conversationsFragment.A0m = (C33101ei) r4.A3f.get();
        conversationsFragment.A2j = (SuggestionsEngine) r3.A0x.get();
        conversationsFragment.A0o = (C33161ep) r4.A3j.get();
        conversationsFragment.A2V = (C33181er) r2.A3H.get();
        conversationsFragment.A1c = (C19980wp) r4.A1x.get();
        conversationsFragment.A0H = r1;
    }

    public static void A0p(C19460v5 r1, C27111My r2, C18800tq r3, C18830tt r4, ConversationsFragment conversationsFragment) {
        conversationsFragment.A0I = r1;
        conversationsFragment.A0n = (C33171eq) r3.A3i.get();
        conversationsFragment.A2z = C18840tu.A00(r3.A16);
        conversationsFragment.A0Q = r1;
        conversationsFragment.A0J = r1;
        conversationsFragment.A2P = (C33191es) r4.A1P.get();
        conversationsFragment.A0u = (C33201et) r2.A2K.get();
        conversationsFragment.A0O = r1;
        conversationsFragment.A2e = (AnonymousClass1AW) r3.A4H.get();
        conversationsFragment.A1O = (C33221ev) r4.A18.get();
        conversationsFragment.A0N = r1;
        conversationsFragment.A0a = (C33231ew) r2.A0i.get();
        conversationsFragment.A0K = C19460v5.A01(r3.A4A.get());
        conversationsFragment.A0Z = (C33261ez) r2.A0f.get();
        conversationsFragment.A2E = (AnonymousClass1RL) r4.A4K.get();
    }

    public static void A0s(C19460v5 r0, C18800tq r1, C18830tt r2, ConversationsFragment conversationsFragment) {
        conversationsFragment.A0U = r0;
        conversationsFragment.A2w = (C27721Pm) r2.A0t.get();
        conversationsFragment.A2t = (AnonymousClass13J) r1.A6z.get();
        conversationsFragment.A14 = (AnonymousClass1Pp) r1.A28.get();
        conversationsFragment.A15 = (AnonymousClass16D) r1.A2A.get();
        conversationsFragment.A0Y = (C32621dv) r1.A2G.get();
        conversationsFragment.A1o = (AnonymousClass165) r1.A2R.get();
        conversationsFragment.A2Y = (AnonymousClass11e) r1.A7u.get();
        conversationsFragment.A1d = (C21060yb) r1.A8W.get();
        conversationsFragment.A17 = (AnonymousClass171) r1.A90.get();
        conversationsFragment.A2q = (AnonymousClass1EM) r1.A3l.get();
    }

    public static void A0t(C19460v5 r1, C18800tq r2, C18830tt r3, ConversationsFragment conversationsFragment) {
        conversationsFragment.A30 = C18840tu.A00(r2.A1M);
        conversationsFragment.A1h = (C19420v0) r2.A9G.get();
        conversationsFragment.A0r = (C26421Kc) r2.A1A.get();
        conversationsFragment.A2p = (C33051ed) r3.A1L.get();
        conversationsFragment.A1q = (AnonymousClass17X) r2.A3v.get();
        conversationsFragment.A1K = (C33061ee) r3.A2g.get();
        conversationsFragment.A0S = r1;
        conversationsFragment.A2b = (C24771Ds) r2.A6h.get();
        conversationsFragment.A0g = (AnonymousClass1T1) r2.A8V.get();
        conversationsFragment.A1m = (AnonymousClass1A5) r2.A2K.get();
        conversationsFragment.A25 = (C233117z) r2.A3w.get();
        conversationsFragment.A1V = (C33071ef) r3.A1A.get();
    }

    public static void A0u(C27111My r1, C18800tq r2, C18830tt r3, ConversationsFragment conversationsFragment, C24381Cf r5) {
        conversationsFragment.A1n = r5;
        conversationsFragment.A2S = (AnonymousClass1FQ) r2.A6E.get();
        conversationsFragment.A1D = (C32941eS) r2.A2I.get();
        conversationsFragment.A2T = (AnonymousClass1EV) r2.A6K.get();
        conversationsFragment.A0p = C27111My.A09(r1);
        conversationsFragment.A0q = (AnonymousClass1KK) r2.A19.get();
        conversationsFragment.A1y = (C236419g) r2.A1v.get();
        conversationsFragment.A2s = (C230116v) r2.A4P.get();
        conversationsFragment.A0z = (AnonymousClass1T4) r2.A1p.get();
        conversationsFragment.A1E = (AnonymousClass1Y3) r2.A2N.get();
        conversationsFragment.A2Z = (AnonymousClass1JI) r3.A3j.get();
        conversationsFragment.A0w = C18800tq.A48(r2);
        conversationsFragment.A2c = (C33041ec) r3.A4G.get();
    }

    public static void A0v(C18800tq r1, C18830tt r2, AnonymousClass155 r3, Object obj) {
        r3.A07 = (C19970wo) obj;
        r3.A0C = (AnonymousClass1N2) r1.A43.get();
        r3.A02 = (C19730wQ) r1.A4g.get();
        AnonymousClass3UP.A02(r3, (AnonymousClass179) r1.A3D.get());
        AnonymousClass3UP.A03(r3, (C20060wx) r1.A8B.get());
        r3.A01 = (C24801Dv) r1.A0D.get();
        r3.A04 = (AnonymousClass1N3) r1.A9B.get();
        AnonymousClass3UP.A01(r3, (AnonymousClass18U) r1.A0I.get());
        AnonymousClass3UP.A00((AnonymousClass1N5) r2.A2o.get(), r3);
        AnonymousClass3UP.A06(r3, (AnonymousClass1G4) r1.A7Z.get());
        AnonymousClass3UP.A05(r3, (AnonymousClass12U) r1.A7L.get());
        AnonymousClass3UP.A04(r3, C18800tq.A8a(r1));
    }

    public static void A0x(C18800tq r1, C18830tt r2, ConversationsFragment conversationsFragment, Object obj) {
        conversationsFragment.A23 = (C21010yW) obj;
        conversationsFragment.A0W = (AnonymousClass1NC) r1.A0C.get();
        conversationsFragment.A1k = (C220712t) r1.A1b.get();
        conversationsFragment.A2k = (AnonymousClass1C6) r1.A7s.get();
        conversationsFragment.A12 = (AnonymousClass196) r1.A8N.get();
        conversationsFragment.A0h = (C32601dt) r2.A46.get();
        conversationsFragment.A0i = (AnonymousClass1X4) r1.A8h.get();
        conversationsFragment.A2x = (AnonymousClass1KI) r1.A0r.get();
        conversationsFragment.A22 = r1.AzV();
        conversationsFragment.A0X = (C24801Dv) r1.A0D.get();
        conversationsFragment.A1A = (C27731Pn) r1.A2E.get();
        conversationsFragment.A1s = (AnonymousClass168) r1.A4N.get();
    }

    public static void A10(C18800tq r1, C18830tt r2, PaymentSettingsFragment paymentSettingsFragment, Object obj) {
        paymentSettingsFragment.A0t = (C19770wU) obj;
        paymentSettingsFragment.A0G = (C21100yf) r1.A7f.get();
        paymentSettingsFragment.A0R = r1.ADd();
        paymentSettingsFragment.A0p = (AnonymousClass9UH) r2.AAb.get();
        paymentSettingsFragment.A0e = (AnonymousClass1EU) r1.A6M.get();
        paymentSettingsFragment.A0Z = (C24601Db) r1.A6D.get();
        paymentSettingsFragment.A0I = (C229216m) r1.A27.get();
        paymentSettingsFragment.A0S = (AnonymousClass13E) r1.A96.get();
        paymentSettingsFragment.A0U = (AnonymousClass1EZ) r1.A65.get();
        paymentSettingsFragment.A0b = (C29121Vk) r1.A6I.get();
        paymentSettingsFragment.A0d = (AnonymousClass1EV) r1.A6K.get();
        paymentSettingsFragment.A0c = (C24631De) r1.A6J.get();
    }

    public static void A11(C18800tq r1, C225314u r2) {
        r2.A04 = (C19770wU) r1.A9Y.get();
        r2.A0D = (C20810yC) r1.A02.get();
        r2.A05 = (AnonymousClass17Y) r1.A3e.get();
        r2.A03 = (C19700wN) r1.A2U.get();
        r2.A04 = (C20690y0) r1.A6r.get();
        r2.A0C = (AnonymousClass1H2) r1.A2x.get();
        r2.A06 = (C21100yf) r1.A7f.get();
        r2.A08 = (C21060yb) r1.A8W.get();
        r2.A09 = (C19420v0) r1.A9G.get();
        r2.A07 = (C19600wD) r1.A24.get();
        AnonymousClass3UH.A00(r2, (C19900wh) r1.A9J.get());
    }

    public static void A12(C18800tq r1, ConversationsFragment conversationsFragment) {
        conversationsFragment.A1f = (C19970wo) r1.A8b.get();
        conversationsFragment.A21 = (C20810yC) r1.A02.get();
        conversationsFragment.A0d = (AnonymousClass17Y) r1.A3e.get();
        conversationsFragment.A2r = (AnonymousClass1N2) r1.A43.get();
        conversationsFragment.A2M = (C28371Sj) r1.A4r.get();
        conversationsFragment.A0f = (C19730wQ) r1.A4g.get();
        conversationsFragment.A1g = (C19630wG) r1.A91.get();
        conversationsFragment.A2G = (AnonymousClass190) r1.A97.get();
        conversationsFragment.A2u = (C19770wU) r1.A9Y.get();
        conversationsFragment.A0v = (AnonymousClass1HX) r1.A0y.get();
        conversationsFragment.A1l = (C220412q) r1.A1l.get();
    }

    public static void A13(C18800tq r1, PaymentSettingsFragment paymentSettingsFragment) {
        paymentSettingsFragment.A0W = (C29221Vu) r1.A6A.get();
        paymentSettingsFragment.A0f = (AnonymousClass1XC) r1.A6F.get();
        paymentSettingsFragment.A0X = (C29231Vv) r1.AVn.get();
        paymentSettingsFragment.A0a = (AnonymousClass1DR) r1.A6G.get();
        paymentSettingsFragment.A0T = (C25251Fo) r1.A5J.get();
        paymentSettingsFragment.A0r = (AnonymousClass1N6) r1.A5V.get();
        paymentSettingsFragment.A0Y = (AnonymousClass1YK) r1.AVp.get();
        paymentSettingsFragment.A0Q = (C24881Ed) r1.A6H.get();
        paymentSettingsFragment.A0M = (C27731Pn) r1.A2E.get();
        paymentSettingsFragment.A0P = (AnonymousClass1FF) r1.A5z.get();
        paymentSettingsFragment.A0V = (AnonymousClass1YO) r1.AVL.get();
    }

    public static void A1D(AnonymousClass6QB r3) {
        r3.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
        r3.A04(new AnonymousClass1AL("xmlns", "w:pay"));
        r3.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
    }

    public static void A1E(AnonymousClass6QB r3) {
        r3.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
        r3.A04(new AnonymousClass1AL("xmlns", "w:pay"));
    }

    public static void A1G(AnonymousClass6QB r3, String str) {
        r3.A04(new AnonymousClass1AL("xmlns", str));
        r3.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"));
    }

    public static void A1H(AnonymousClass6QB r3, String str) {
        r3.A04(new AnonymousClass1AL("xmlns", str));
        r3.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
    }

    public static void A1J(Object obj, int i, int i2) {
        if (i2 < i - 1) {
            System.arraycopy(obj, i2 + 1, obj, i2, (i - i2) - 1);
        }
    }

    public static void A1L(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[41] = obj;
        objArr[42] = obj2;
        objArr[43] = obj3;
    }

    public static void A1P(String str, String str2, List list) {
        list.add(new AnonymousClass1AL(str, str2));
    }

    public static void A1S(String str, Object[] objArr, int i, int i2) {
        objArr[i] = new AnonymousClass1AL("xmlns", str);
        objArr[i2] = new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
    }

    public static void A1T(StringBuilder sb, StringBuilder sb2, C006302t r4, byte[] bArr) {
        sb.append(AnonymousClass02R.A0A(r4, bArr));
        sb2.append(sb.toString());
        sb2.append(10);
    }

    public static void A1U(AbstractCollection abstractCollection) {
        abstractCollection.remove(C203789os.A08);
        abstractCollection.remove(C203789os.A03);
        abstractCollection.remove(C203789os.A0B);
        abstractCollection.remove(C203789os.A06);
        abstractCollection.remove(C203789os.A07);
        abstractCollection.remove(C203789os.A05);
        abstractCollection.remove(C203789os.A0A);
        abstractCollection.remove(C203789os.A02);
        abstractCollection.remove(C203789os.A0C);
        abstractCollection.remove(C203789os.A09);
    }

    public static int A03(CertPath certPath, int i, int i2) {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i);
        if (x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN()) || i2 == 0) {
            return i2;
        }
        return i2 - 1;
    }

    public static long A07(List list, int i) {
        long longValue = ((Number) list.get(i)).longValue();
        return (longValue >> 63) ^ (longValue << 1);
    }

    public static long A08(List list, int i) {
        return ((Number) list.get(i)).longValue();
    }

    public static C18830tt A0B(C18800tq r2, C47142dX r3, AnonymousClass004 r4) {
        r3.A0A = (AnonymousClass1X7) r4.get();
        r3.A00 = (AnonymousClass17Y) r2.A3e.get();
        r3.A01 = (AnonymousClass1XY) r2.A7c.get();
        r3.A02 = (AnonymousClass1X4) r2.A8h.get();
        r3.A0B = (AnonymousClass1SV) r2.A5I.get();
        r3.A04 = (C20830yE) r2.A9E.get();
        r3.A07 = (AnonymousClass1ST) r2.A4i.get();
        C18830tt r1 = r2.A00;
        r3.A08 = (AnonymousClass3P3) r1.A9c.get();
        r3.A03 = (AnonymousClass1V6) r2.A4v.get();
        r3.A06 = (AnonymousClass1Y4) r2.AZK.get();
        r3.A0C = C18840tu.A00(r1.A35);
        return r1;
    }

    public static C21240yt A0D(Object obj, byte b) {
        return new C21240yt(new SSLException(obj.toString()), b);
    }

    public static C235919b A0G(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        return new C235919b(sb.toString());
    }

    public static C235919b A0H(String str, StringBuilder sb, Throwable th, AbstractCollection abstractCollection) {
        sb.append(str);
        sb.append(th.getMessage());
        abstractCollection.add(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Could not parse stanza into valid response class, encountered the following errors for each possible response:\n");
        sb2.append(AnonymousClass14B.A07("\n", abstractCollection));
        return new C235919b(sb2.toString());
    }

    public static C203399nx A0I(AnonymousClass6QB r0, AnonymousClass6QB r1) {
        r1.A05(r0.A03());
        return r1.A03();
    }

    public static C28541Tb A0J(int i) {
        return new C28541Tb(Integer.valueOf(i));
    }

    public static C25311Fu A0K(int i) {
        return new C25311Fu(Integer.valueOf(i), (String) null);
    }

    public static ArrayIndexOutOfBoundsException A0M(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        return new ArrayIndexOutOfBoundsException(sb.toString());
    }

    public static IllegalArgumentException A0N(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj.getClass().getName());
        return new IllegalArgumentException(sb.toString());
    }

    public static IllegalArgumentException A0O(StringBuilder sb, int i) {
        sb.append(i);
        return new IllegalArgumentException(sb.toString());
    }

    public static Object A0R(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static RuntimeException A0T() {
        AnonymousClass00C.A03();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static RuntimeException A0U(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        return new RuntimeException(sb.toString());
    }

    public static String A0V(int i, Object[] objArr) {
        objArr[1] = Integer.valueOf(i);
        objArr[2] = 1;
        return String.format("Pos: %d, limit: %d, len: %d", objArr);
    }

    public static String A0W(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj.getClass());
        return sb.toString();
    }

    public static String A0X(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    public static String A0Y(String str, StringBuilder sb) {
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public static ArrayList A0e(String str, String str2) {
        return new ArrayList(Arrays.asList(new String[]{str, str2}));
    }

    public static ArrayList A0f(String str, String str2, String str3) {
        return new ArrayList(Arrays.asList(new String[]{str, str2, str3}));
    }

    public static JSONObject A0h(C24601Db r1) {
        String A06 = r1.A06();
        if (TextUtils.isEmpty(A06)) {
            return new JSONObject();
        }
        return new JSONObject(A06);
    }

    public static void A0j(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            window.addFlags(DefaultCrypto.BUFFER_SIZE);
        }
    }

    public static void A0k(Context context, View view) {
        Drawable A00 = AnonymousClass00E.A00(context, R.drawable.search_attachment_background);
        C18740tg.A06(A00);
        view.setBackground(AnonymousClass3UF.A08(A00, AnonymousClass00F.A00(view.getContext(), C224514j.A00(view.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved))));
    }

    public static void A0n(View view, int i, int i2) {
        AnonymousClass3UF.A0E((ImageView) view.findViewById(i), i2);
    }

    public static void A0q(C19460v5 r1, C32581dr r2, C18800tq r3, C18830tt r4, ConversationsFragment conversationsFragment) {
        conversationsFragment.A2Q = (C28361Si) r3.A56.get();
        conversationsFragment.A1u = (AnonymousClass12P) r3.A5G.get();
        conversationsFragment.A1z = (AnonymousClass1LU) r3.A7p.get();
        conversationsFragment.A1x = (C26171Jd) r3.A4s.get();
        conversationsFragment.A1v = (AnonymousClass1SA) r4.A2z.get();
        conversationsFragment.A0e = C32581dr.A01(r2);
        conversationsFragment.A32 = C18840tu.A00(r3.A1Z);
        conversationsFragment.A0L = r1;
        conversationsFragment.A10 = (AnonymousClass1LV) r3.A1q.get();
        conversationsFragment.A1F = (AnonymousClass1A6) r3.A2P.get();
        conversationsFragment.A1r = (AnonymousClass1HO) r3.A4M.get();
        conversationsFragment.A27 = (C26801Lo) r3.A60.get();
        conversationsFragment.A0T = r1;
        conversationsFragment.A11 = C18800tq.A4u(r3);
    }

    public static void A0r(C19460v5 r1, C18800tq r2, C18830tt r3, ConversationsFragment conversationsFragment) {
        conversationsFragment.A2l = C18800tq.ALZ(r2);
        conversationsFragment.A0l = (AnonymousClass19J) r2.A9p.get();
        conversationsFragment.A18 = (C235618y) r2.A15.get();
        conversationsFragment.A0R = r1;
        conversationsFragment.A28 = (AnonymousClass1EL) r2.A8L.get();
        conversationsFragment.A2A = (C28101Ri) r3.A2C.get();
        conversationsFragment.A2m = (C32661dz) r2.A0E.get();
        conversationsFragment.A1Z = C18830tt.A4I(r3);
        conversationsFragment.A2f = (AnonymousClass1CR) r2.A1i.get();
        conversationsFragment.A2R = (C20600xp) r2.A5q.get();
        conversationsFragment.A1e = (AnonymousClass1MP) r2.A8X.get();
        conversationsFragment.A2d = (C29341Wg) r2.A8q.get();
        conversationsFragment.A0j = (C29411Wn) r2.A9H.get();
    }

    public static void A0w(C18800tq r1, C18830tt r2, ConversationsFragment conversationsFragment) {
        conversationsFragment.A2X = (C28441Sr) r1.A1g.get();
        conversationsFragment.A1p = (C20650xu) r1.A3Z.get();
        conversationsFragment.A2N = (C32641dx) r2.A4F.get();
        conversationsFragment.A20 = (AnonymousClass1H2) r1.A2x.get();
        conversationsFragment.A2o = (AnonymousClass1Q0) r1.A0L.get();
        conversationsFragment.A0t = (AnonymousClass1NG) r1.A0v.get();
        conversationsFragment.A2v = (AnonymousClass1HP) r1.A1G.get();
        conversationsFragment.A0y = (AnonymousClass1AO) r1.A1W.get();
        conversationsFragment.A16 = (AnonymousClass16I) r1.A2B.get();
        conversationsFragment.A24 = (C20350xQ) r1.A3k.get();
        conversationsFragment.A1B = (C32611du) r2.A2N.get();
    }

    public static void A0y(C18800tq r1, C18830tt r2, ConversationsFragment conversationsFragment, AnonymousClass004 r4) {
        conversationsFragment.A2n = (C32811eE) r4.get();
        conversationsFragment.A0s = (C32821eF) r2.A33.get();
        conversationsFragment.A2y = C18840tu.A00(r1.A0x);
        conversationsFragment.A1j = (AnonymousClass1HJ) r1.A1O.get();
        conversationsFragment.A2I = r1.AzZ();
        conversationsFragment.A0P = (C19460v5) r1.A5v.get();
        conversationsFragment.A0x = (C24361Cd) r1.A1j.get();
        conversationsFragment.A38 = C25141Fd.A00();
        conversationsFragment.A19 = (AnonymousClass16K) r1.A2C.get();
        conversationsFragment.A1C = (C20430xY) r1.A2H.get();
        conversationsFragment.A1w = (AnonymousClass1YR) r1.A8e.get();
        conversationsFragment.A2C = (AnonymousClass1JL) r2.A3t.get();
        conversationsFragment.A31 = C18840tu.A00(r1.A1Y);
    }

    public static void A0z(C18800tq r1, C18830tt r2, PaymentSettingsFragment paymentSettingsFragment) {
        paymentSettingsFragment.A0H = (C20050ww) r1.A7v.get();
        paymentSettingsFragment.A0F = (AnonymousClass3DY) r1.A7b.get();
        paymentSettingsFragment.A0q = (AnonymousClass1FR) r1.A6O.get();
        paymentSettingsFragment.A0K = (AnonymousClass16D) r1.A2A.get();
        paymentSettingsFragment.A0L = (AnonymousClass171) r1.A90.get();
        paymentSettingsFragment.A0i = (C199849g7) r1.A6C.get();
        paymentSettingsFragment.A0J = (AnonymousClass1Pp) r1.A28.get();
        paymentSettingsFragment.A0N = (C19970wo) r1.A8b.get();
        paymentSettingsFragment.A0D = (AnonymousClass17Y) r1.A3e.get();
        paymentSettingsFragment.A0O = (C19630wG) r1.A91.get();
        paymentSettingsFragment.A0s = (C32681e1) r2.A2Y.get();
    }

    public static void A15(C24611Dc r1, Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        r1.A05(sb.toString());
    }

    public static void A16(C24611Dc r1, Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        r1.A06(sb.toString());
    }

    public static void A17(C24611Dc r1, Object obj, StringBuilder sb) {
        sb.append(obj);
        r1.A06(sb.toString());
    }

    public static void A18(C24611Dc r1, String str, StringBuilder sb) {
        sb.append(str);
        r1.A06(sb.toString());
    }

    public static void A19(AnonymousClass3T1 r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A1J);
        Log.w(sb.toString());
    }

    public static void A1A(AnonymousClass3T1 r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A1I);
        Log.w(sb.toString());
    }

    public static void A1B(AnonymousClass3T1 r0, String str, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(r0.A1I);
        C18740tg.A0E(z, sb.toString());
    }

    public static void A1C(AnonymousClass1AL r2, AnonymousClass6QB r3) {
        r3.A04(r2);
        r3.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
        r3.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"));
    }

    public static void A1F(AnonymousClass6QB r0, AnonymousClass6QB r1, C592133b r2) {
        r1.A05(r0.A03());
        r2.A00 = r1.A03();
    }

    public static void A1M(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj.toString());
    }

    public static void A1N(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj.getClass().getName());
    }

    public static void A1O(String str, String str2, StringBuffer stringBuffer, org.apache.commons.logging.Log log) {
        stringBuffer.append(str);
        stringBuffer.append(str2);
        log.debug(stringBuffer.toString());
    }

    public static void A1Q(String str, StringBuffer stringBuffer, org.apache.commons.logging.Log log) {
        stringBuffer.append(str);
        log.debug(stringBuffer.toString());
    }

    public static void A1R(String str, StringBuilder sb, Throwable th, AbstractCollection abstractCollection) {
        sb.append(str);
        sb.append(th.getMessage());
        abstractCollection.add(sb.toString());
    }

    public static boolean A1Y(Parcel parcel) {
        if (parcel.readByte() != 0) {
            return true;
        }
        return false;
    }

    public static boolean A1a(C191269Ch r0, B4X b4x) {
        return ((Boolean) b4x.B84(r0)).booleanValue();
    }

    public static Long A0P() {
        return -9007199254740991L;
    }

    public static Long A0Q() {
        return 9007199254740991L;
    }
}
