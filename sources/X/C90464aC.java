package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.PowerManager;
import android.util.Base64;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.backup.encryptedbackup.PasswordInputFragment;
import com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave;
import com.whatsapp.calling.service.VoiceServiceEventCallback;
import com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.net.URI;
import java.net.URLConnection;
import java.nio.Buffer;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.json.JSONObject;
import org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.4aC  reason: invalid class name and case insensitive filesystem */
public abstract class C90464aC {
    public static float A04(float[] fArr, float f, float f2, float f3) {
        return (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
    }

    public static float A05(float[] fArr, float f, float f2, float f3) {
        return (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
    }

    public static float A06(float[] fArr, float f, float f2, float f3) {
        return (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
    }

    public static int A07(int i) {
        if (i != 0) {
            return -1 >>> (32 - i);
        }
        return 0;
    }

    public static TranslateAnimation A0E(int i) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) i, 0.0f);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        translateAnimation.setDuration(120);
        return translateAnimation;
    }

    public static AnonymousClass1RJ A0J(View view, int i) {
        AnonymousClass00C.A0D(view, 0);
        View A02 = C012005e.A02(view, i);
        AnonymousClass00C.A08(A02);
        return new AnonymousClass1RJ(A02);
    }

    public static IllegalArgumentException A0O(int i) {
        return new IllegalArgumentException(String.format("No implementation bound to key: %s", new Object[]{Integer.valueOf(i)}));
    }

    public static NullPointerException A0T(List list) {
        AnonymousClass00C.A0E(list.get(0), "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<kotlin.Any>");
        return new NullPointerException("getExtension");
    }

    public static String A0Y(Object obj, StringBuilder sb, C1271567e r4) {
        sb.append(obj);
        sb.append(", package name: ");
        if (r4 != null) {
            return r4.A02;
        }
        return null;
    }

    public static String A0Z(Object obj, Map map) {
        Object obj2 = map.get(obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return null;
    }

    public static JSONObject A0q(Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        return new JSONObject();
    }

    public static void A16(StickerExpressionsViewModel stickerExpressionsViewModel, AnonymousClass56Q r6, List list, int i) {
        if (i != -1) {
            stickerExpressionsViewModel.A0h.setValue(new AnonymousClass56Q((String) null, r6.A02, list.subList(i + 1, list.size())));
        }
    }

    public static void A1D(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[1] = obj;
        objArr[2] = obj2;
        objArr[3] = obj3;
    }

    public static int[] A1b(FormItemEditText formItemEditText) {
        formItemEditText.A0C = null;
        formItemEditText.A0E = null;
        formItemEditText.A0D = null;
        formItemEditText.A05 = 0;
        formItemEditText.A00 = 24.0f;
        formItemEditText.A01 = 4.0f;
        formItemEditText.A02 = 8.0f;
        formItemEditText.A09 = new Rect();
        formItemEditText.A0G = false;
        formItemEditText.A0F = null;
        formItemEditText.A03 = 1.0f;
        formItemEditText.A04 = 2.0f;
        formItemEditText.A0H = false;
        formItemEditText.A0I = false;
        formItemEditText.A0L = new int[][]{new int[]{16842913}, new int[]{16842914}, new int[]{16842908}, new int[]{-16842908}};
        return new int[4];
    }

    public static float A01(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static int A08(long j) {
        return ((int) (j ^ (j >>> 32))) * 31;
    }

    public static Uri A0D(URI uri) {
        return new Uri.Builder().scheme(uri.getScheme()).encodedAuthority(uri.getRawAuthority()).encodedPath(uri.getRawPath()).encodedQuery(uri.getRawQuery()).encodedFragment(uri.getRawFragment()).build();
    }

    public static C1506776e A0F(C1506776e r1) {
        if (r1 == null) {
            return new C1506776e(new C137856gq[16]);
        }
        return r1;
    }

    public static C1506776e A0G(C1506776e r1) {
        if (r1 == null) {
            return new C1506776e(new C137856gq[16]);
        }
        return r1;
    }

    public static String A0b(String str) {
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        Charset charset = C19430v1.A0D;
        AnonymousClass00C.A09(charset);
        byte[] bytes = str.getBytes(charset);
        AnonymousClass00C.A08(bytes);
        instance.update(bytes);
        return Base64.encodeToString(instance.digest(), 2);
    }

    public static String A0d(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(':');
        sb.append(str2);
        return sb.toString();
    }

    public static String A0e(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static StringBuilder A0h(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        return sb;
    }

    public static StringBuilder A0k(Job job) {
        StringBuilder sb = new StringBuilder();
        sb.append("; persistentId=");
        sb.append(job.A01);
        return sb;
    }

    public static PublicKey A0l(byte[] bArr) {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr));
    }

    public static SecretKey A0n() {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(256);
        return instance.generateKey();
    }

    public static C05170Nv A0o() {
        StringBuilder sb = new StringBuilder();
        sb.append("An operation is not implemented: ");
        sb.append("Not yet implemented");
        return new C05170Nv(sb.toString());
    }

    public static void A0s(MediaCodec.BufferInfo bufferInfo, Buffer buffer) {
        buffer.position(bufferInfo.offset);
        buffer.limit(bufferInfo.offset + bufferInfo.size);
    }

    public static void A0t(PowerManager.WakeLock wakeLock) {
        if (wakeLock != null && wakeLock.isHeld()) {
            wakeLock.release();
        }
    }

    public static void A0u(SparseIntArray sparseIntArray) {
        sparseIntArray.put(10241, 9729);
        sparseIntArray.put(10240, 9729);
        sparseIntArray.put(10242, 33071);
        sparseIntArray.put(10243, 33071);
    }

    public static void A0w(C32581dr r1, C18800tq r2, C18830tt r3, C18820ts r4, MediaComposerFragment mediaComposerFragment) {
        mediaComposerFragment.A07 = r4;
        mediaComposerFragment.A0I = C18800tq.AG6(r2);
        mediaComposerFragment.A0L = (AnonymousClass1BB) r2.A85.get();
        mediaComposerFragment.A0N = C18800tq.ALZ(r2);
        mediaComposerFragment.A0M = (AnonymousClass1AP) r2.A89.get();
        mediaComposerFragment.A0H = (C104635An) r3.ACF.get();
        mediaComposerFragment.A06 = (C19420v0) r2.A9G.get();
        mediaComposerFragment.A0G = (AnonymousClass6vC) r3.ACD.get();
        mediaComposerFragment.A0K = (AnonymousClass1HA) r2.A84.get();
        mediaComposerFragment.A0D = (C117425mF) r1.A1J.A01.get();
        mediaComposerFragment.A05 = (C19630wG) r2.A91.get();
        mediaComposerFragment.A0U = C18840tu.A00(r3.A1z);
        mediaComposerFragment.A0Q = (C1270866x) r3.A9g.get();
    }

    public static void A0x(C32581dr r1, C18800tq r2, C18830tt r3, MediaComposerFragment mediaComposerFragment) {
        mediaComposerFragment.A0T = C18840tu.A00(r1.A01);
        mediaComposerFragment.A0S = C18840tu.A00(r1.A02);
        mediaComposerFragment.A0J = (C28331Sf) r2.A7w.get();
        mediaComposerFragment.A0B = (AnonymousClass190) r2.A97.get();
        mediaComposerFragment.A09 = (C121575tM) r3.ACG.get();
    }

    public static void A0y(C18800tq r1, C18830tt r2, AnonymousClass155 r3, Object obj) {
        r3.A07 = (C19970wo) obj;
        r3.A0C = (AnonymousClass1N2) r1.A43.get();
        r3.A02 = (C19730wQ) r1.A4g.get();
        r3.A06 = (AnonymousClass179) r1.A3D.get();
        r3.A08 = (C20060wx) r1.A8B.get();
        r3.A01 = (C24801Dv) r1.A0D.get();
        r3.A04 = (AnonymousClass1N3) r1.A9B.get();
        AnonymousClass3UP.A01(r3, (AnonymousClass18U) r1.A0I.get());
        AnonymousClass3UP.A00((AnonymousClass1N5) r2.A2o.get(), r3);
        r3.A0B = (AnonymousClass1G4) r1.A7Z.get();
        r3.A0A = (AnonymousClass12U) r1.A7L.get();
        AnonymousClass3UP.A04(r3, C18800tq.A8a(r1));
    }

    public static void A0z(C18800tq r1, C18830tt r2, PasswordInputFragment passwordInputFragment, C20810yC r4) {
        passwordInputFragment.A06 = r4;
        passwordInputFragment.A04 = (C21060yb) r1.A8W.get();
        passwordInputFragment.A05 = (C18820ts) r1.A9X.get();
        passwordInputFragment.A07 = (C32711e4) r2.A2Z.get();
    }

    public static void A10(C18800tq r1, C18830tt r2, C20810yC r3, MediaComposerFragment mediaComposerFragment) {
        mediaComposerFragment.A0A = r3;
        mediaComposerFragment.A02 = (AnonymousClass17Y) r1.A3e.get();
        mediaComposerFragment.A0O = (AnonymousClass1N2) r1.A43.get();
        mediaComposerFragment.A01 = (C19700wN) r1.A2U.get();
        mediaComposerFragment.A0R = (C19770wU) r1.A9Y.get();
        mediaComposerFragment.A08 = (AnonymousClass1H2) r1.A2x.get();
        mediaComposerFragment.A03 = (C21100yf) r1.A7f.get();
        mediaComposerFragment.A0F = (C104655Aq) r2.ABd.get();
        mediaComposerFragment.A0C = (AnonymousClass2XH) r1.A4W.get();
        mediaComposerFragment.A04 = (C21060yb) r1.A8W.get();
        mediaComposerFragment.A0P = (AnonymousClass1GX) r1.A4k.get();
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
        r2.A0A = (C19900wh) r1.A9J.get();
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A14(X.AnonymousClass6YM r5) {
        /*
            X.1Hw r0 = r5.A2s
            android.content.Context r4 = r5.A22
            r2 = 0
            X.AnonymousClass00C.A0D(r4, r2)
            X.0v0 r0 = r0.A02
            android.graphics.Point r1 = r0.A0W(r2)
            android.graphics.Point r0 = r0.A0X(r2)
            int r2 = r1.x
            int r3 = r1.y
            int r1 = r0.x
            int r0 = r0.y
            int r2 = r2 + r1
            int r2 = r2 / 2
            int r3 = r3 + r0
            int r1 = r3 / 2
            if (r2 == 0) goto L_0x0053
            if (r1 == 0) goto L_0x0053
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r2, r1)
        L_0x0029:
            int r1 = r0.x
            int r0 = r0.y
            com.whatsapp.voipcalling.Voip.setScreenSize(r1, r0)
        L_0x0030:
            com.whatsapp.voipcalling.camera.VoipCameraManager r3 = r5.A39
            X.1Pa r2 = r5.A2D
            X.0yC r1 = r2.A01
            r0 = 151(0x97, float:2.12E-43)
            java.lang.String r1 = r1.A09(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x004d
            android.content.SharedPreferences r2 = X.C27631Pa.A00(r2)
            r1 = 0
            java.lang.String r0 = "camera2_required_hardware_support_level"
            java.lang.String r1 = r2.getString(r0, r1)
        L_0x004d:
            X.1aM r0 = r5.A2C
            r3.setRequestedCamera2SupportLevel(r1, r0)
            return
        L_0x0053:
            android.graphics.Point r0 = X.C25961Ii.A01(r4)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "voip/service/updateVoipScreenSize point is null, Voip.screenSize is not set"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90464aC.A14(X.6YM):void");
    }

    public static void A1B(Object obj, Object obj2, Object obj3, Object obj4) {
        AnonymousClass00C.A0D(obj, 20);
        AnonymousClass00C.A0D(obj2, 21);
        AnonymousClass00C.A0D(obj3, 22);
        AnonymousClass00C.A0D(obj4, 23);
    }

    public static void A1C(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[22] = obj;
        objArr[23] = obj2;
        objArr[24] = obj3;
    }

    public static void A1E(Object obj, Object obj2, Object[] objArr) {
        objArr[0] = new AnonymousClass011(obj, obj2);
    }

    public static void A1F(Object obj, Object obj2, Object[] objArr) {
        objArr[1] = new AnonymousClass011(obj, obj2);
    }

    public static void A1O(String str, StringBuilder sb, float[] fArr, int i) {
        Integer A00 = AnonymousClass3LM.A00((int) fArr[i + 1]);
        float f = fArr[i + 2];
        sb.append(str);
        sb.append(AnonymousClass3LM.A01(A00));
        sb.append(": ");
        sb.append(f);
    }

    public static void A1P(StringBuilder sb, String str) {
        if (!str.isEmpty()) {
            sb.append(str);
            sb.append("|");
        }
    }

    public static void A1S(URLConnection uRLConnection) {
        uRLConnection.setConnectTimeout(15000);
        uRLConnection.setReadTimeout(30000);
    }

    public static float A02(Context context, float f, int i) {
        return TypedValue.applyDimension(i, f, context.getResources().getDisplayMetrics());
    }

    public static float A03(AnonymousClass00S r0) {
        return ((Number) r0.invoke()).floatValue();
    }

    public static int A09(C161337ma r0, Object obj) {
        if (r0.B2f(obj)) {
            return 32;
        }
        return 16;
    }

    public static int A0A(C161337ma r0, Object obj) {
        if (r0.B2f(obj)) {
            return 4;
        }
        return 2;
    }

    public static long A0B(float f, float f2) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f);
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public static SharedPreferences.Editor A0C(AnonymousClass005 r0) {
        return ((SharedPreferences) r0.get()).edit();
    }

    public static C160377ku A0H(List list, int i) {
        Object obj = list.get(i);
        if (obj == null) {
            return null;
        }
        return ((AnonymousClass6JJ) obj).A00;
    }

    public static C18800tq A0I(Context context) {
        return (C18800tq) C18810tr.A00(context.getApplicationContext(), C18800tq.class);
    }

    public static File A0K(File file, String str, StringBuilder sb) {
        sb.append(str);
        return new File(file, sb.toString());
    }

    public static File A0L(String str, AnonymousClass00T r3) {
        return new File(((File) r3.getValue()).getAbsolutePath(), str);
    }

    public static IOException A0M(String str, StringBuilder sb) {
        sb.append(str);
        return new IOException(sb.toString());
    }

    public static InvalidObjectException A0N(String str, StringBuilder sb) {
        sb.append(str);
        return new InvalidObjectException(sb.toString());
    }

    public static IllegalArgumentException A0P(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return new IllegalArgumentException(sb.toString());
    }

    public static IllegalStateException A0Q(Object obj, Object obj2, String str, int i, int i2) {
        String obj3 = obj.toString();
        AnonymousClass00C.A08(obj3);
        StringBuilder sb = new StringBuilder();
        sb.append("Error while pushing ");
        sb.append(obj2);
        sb.append(". Not all arguments were provided. Missing ");
        sb.append(i);
        sb.append(" int arguments (");
        sb.append(str);
        sb.append(") and ");
        sb.append(i2);
        sb.append(" object arguments (");
        sb.append(obj3);
        sb.append(").");
        return new IllegalStateException(sb.toString());
    }

    public static IllegalStateException A0R(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        return new IllegalStateException(sb.toString());
    }

    public static Long A0S(Number number) {
        return Long.valueOf(number.longValue() + 1);
    }

    public static RuntimeException A0U(String str, StringBuilder sb) {
        sb.append(str);
        return new RuntimeException(sb.toString());
    }

    public static String A0V() {
        String obj = UUID.randomUUID().toString();
        AnonymousClass00C.A08(obj);
        return obj;
    }

    public static String A0W(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj.hashCode());
        return sb.toString();
    }

    public static String A0X(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    public static String A0a(Object obj, Map map) {
        Object obj2 = map.get(obj);
        AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type kotlin.String");
        return (String) obj2;
    }

    public static String A0c(String str, Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf.length() != 0) {
            return str.concat(valueOf);
        }
        return new String(str);
    }

    public static String A0f(String str, StringBuilder sb, char c) {
        sb.append(c);
        sb.append(str);
        return sb.toString();
    }

    public static String A0g(StringBuilder sb, float f) {
        sb.append(f);
        sb.append(')');
        return sb.toString();
    }

    public static StringBuilder A0i(Object obj, int i) {
        return new StringBuilder(i + String.valueOf(obj).length());
    }

    public static StringBuilder A0j(Object obj, StringBuilder sb) {
        sb.append(obj.toString());
        return new StringBuilder();
    }

    public static Random A0m(VoiceParticipantAudioWave voiceParticipantAudioWave) {
        voiceParticipantAudioWave.A03();
        voiceParticipantAudioWave.A08 = new double[0];
        voiceParticipantAudioWave.A0A = new double[0];
        voiceParticipantAudioWave.A09 = new double[0];
        voiceParticipantAudioWave.A04 = new Paint(1);
        return new Random();
    }

    public static C15390nG A0p(AnonymousClass02E r1, AnonymousClass05H r2) {
        C02380Ab A0m = r1.A0m();
        A0m.A00();
        AnonymousClass01N r12 = A0m.A00;
        AnonymousClass00C.A08(r12);
        return C52992qW.A00(AnonymousClass01P.STARTED, r12, r2);
    }

    public static void A0r(Context context, Chip chip, int i) {
        chip.setTextColor(AnonymousClass00F.A00(context, i));
        chip.setChipBackgroundColorResource(C224514j.A00(chip.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
    }

    public static void A0v(C161337ma r1, C009003v r2, int i) {
        Integer valueOf = Integer.valueOf(i);
        r1.Bwv(valueOf);
        r1.B1A(valueOf, r2);
    }

    public static void A12(C18830tt r1, RoundedBottomSheetDialogFragment roundedBottomSheetDialogFragment) {
        roundedBottomSheetDialogFragment.A00 = C18830tt.A85(r1);
        roundedBottomSheetDialogFragment.A00 = (C120485ra) r1.A7n.get();
    }

    public static void A13(C133346Xy r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(AnonymousClass3LV.A00(r0));
        Log.i(sb.toString());
    }

    public static void A15(VoiceServiceEventCallback voiceServiceEventCallback, String str) {
        Log.i(str);
        voiceServiceEventCallback.voiceService.A0R(30, (String) null);
    }

    public static void A17(C24611Dc r1, Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj.toString());
        r1.A05(sb.toString());
    }

    public static void A18(File file) {
        if (file.exists()) {
            file.delete();
        }
    }

    public static void A19(File file, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(file.length());
    }

    public static void A1A(File file, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(file.getAbsolutePath());
    }

    public static void A1G(String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        android.util.Log.d(str3, sb.toString());
    }

    public static void A1H(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(AnonymousClass3LV.A01(str2));
    }

    public static void A1I(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(C34191gb.A07(str2));
        Log.i(sb.toString());
    }

    public static void A1J(String str, String str2, StringBuilder sb, char c) {
        sb.append(str);
        sb.append(str2);
        sb.append(c);
    }

    public static void A1K(String str, String str2, StringBuilder sb, int i, int i2) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
    }

    public static void A1L(String str, String str2, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(str2);
        Log.e(sb.toString(), th);
    }

    public static void A1M(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        C18740tg.A0D(false, sb.toString());
    }

    public static void A1N(String str, StringBuilder sb, boolean z) {
        sb.append(str);
        C18740tg.A0D(z, sb.toString());
    }

    public static void A1Q(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(0.0f);
    }

    public static void A1R(StringBuilder sb, String str) {
        sb.append(str);
        AnonymousClass00C.A0D(sb.toString(), 0);
    }

    public static void A1T(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(Long.valueOf(((AnonymousClass3T1) it.next()).A1N));
    }

    public static void A1U(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((Jid) it.next()).getRawString());
    }

    public static void A1V(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(String.valueOf(((Number) it.next()).longValue()));
    }

    public static boolean A1W(C161337ma r1, int i) {
        return AnonymousClass00C.A0J(r1.BnZ(), Integer.valueOf(i));
    }

    public static boolean A1X(C161337ma r0, Object obj, Object obj2, int i) {
        r0.Bum(i);
        return r0.B2f(obj) | r0.B2f(obj2);
    }

    public static boolean A1Y(Object obj, C006302t r1) {
        return ((Boolean) r1.invoke(obj)).booleanValue();
    }

    public static boolean A1Z(String str, StringBuilder sb) {
        sb.append(str);
        AnonymousClass00C.A0D(sb.toString(), 0);
        return false;
    }

    public static boolean A1a(Map map, Object obj) {
        Object obj2 = map.get(obj);
        AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) obj2).booleanValue();
    }

    public static float A00(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
