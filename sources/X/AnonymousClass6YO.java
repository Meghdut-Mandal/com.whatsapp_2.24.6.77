package X;

import android.content.Context;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.InputStream;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6YO  reason: invalid class name */
public abstract class AnonymousClass6YO {
    public static final byte[] A00 = {0, 1};
    public static final byte[] A01 = {0, 1};
    public static final byte[] A02 = {0, 2};

    public static int A00(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 6;
        }
        if (i == 2) {
            return 7;
        }
        if (i == 3) {
            return 6;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 8;
        }
        throw C90464aC.A0R("Unexpected backup result value: ", AnonymousClass000.A0u(), i);
    }

    public static C1264263x A03(InputStream inputStream) {
        byte[] bArr = new byte[2];
        byte[] bArr2 = new byte[32];
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        byte[] bArr5 = new byte[67];
        inputStream.read(bArr5);
        System.arraycopy(bArr5, 0, bArr, 0, 2);
        if (Arrays.equals(bArr, A02) || Arrays.equals(bArr, A01)) {
            int i = 3;
            String valueOf = String.valueOf(bArr5[2]);
            byte[][] bArr6 = {bArr2, bArr3, bArr4};
            int i2 = 0;
            do {
                byte[] bArr7 = bArr6[i2];
                System.arraycopy(bArr5, i, bArr7, 0, bArr7.length);
                i += bArr7.length;
                i2++;
            } while (i2 < 3);
            return new C1264263x(valueOf, bArr, bArr2, bArr3, bArr4);
        }
        throw new C18890tz();
    }

    public static void A0A(Context context, C24331Ca r8, C24391Cg r9) {
        int i;
        String str;
        synchronized (r9) {
            r9.A00 = true;
        }
        r9.A00("CoreBackupUtils/sendCreateBackupKeyIfNeeded/started", 2);
        if (C36441kJ.A0w(context.getFilesDir(), "key").exists()) {
            String str2 = null;
            try {
                C1259862c A04 = A04(context);
                if (A04 != null) {
                    str2 = A04.A00.A00;
                }
            } catch (C18890tz | InvalidParameterException unused) {
            }
            if (!TextUtils.isEmpty(str2)) {
                return;
            }
        }
        byte[] A0H = C18750th.A0H(16);
        byte[] A0G = A0G(A0H);
        if (A0G != null) {
            ConditionVariable conditionVariable = new ConditionVariable(false);
            r8.A01(new C1496972k(conditionVariable, 44), A0G, A0H, 1);
            r9.A00("CoreBackupUtils/backup/waiting-for-the-key", 2);
            if (!conditionVariable.block(32000)) {
                i = 4;
                str = "CoreBackupUtils/backup/backup-key-not-received";
            } else {
                r9.A00("CoreBackupUtils/backup/key-received", 2);
                return;
            }
        } else {
            i = 3;
            str = "CoreBackupUtils/backup/backup-key/null/account-hash/null";
        }
        r9.A00(str, i);
    }

    public static void A0C(C19700wN r3, byte[] bArr) {
        int length = bArr.length;
        if (length != 32) {
            r3.A0E("crypto-iq-incorrect-account-hash-size", String.valueOf(length), true);
        }
    }

    public static long A02(C20810yC r7, boolean z) {
        if (z) {
            return -1;
        }
        Calendar instance = Calendar.getInstance();
        C90474aD.A1Q(instance, 0);
        instance.set(11, r7.A07(954) + 2);
        return Math.max(instance.getTimeInMillis(), System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(C36441kJ.A0B(r7, 955)));
    }

    public static ArrayList A07(File file, String str, List list) {
        File file2 = new File(file, str);
        ArrayList A08 = A08(file2, list);
        A0E(file2, A08);
        return A08;
    }

    public static ArrayList A08(File file, List list) {
        File[] listFiles;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        ArrayList A0I = AnonymousClass001.A0I();
        String pattern = simpleDateFormat.toPattern();
        String A012 = AnonymousClass6UF.A01(file.getName());
        String A022 = AnonymousClass6UF.A02(file.getName(), "");
        List list2 = list;
        int size = list2.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = AnonymousClass6UF.A02(file.getName(), C36401kF.A0s(list2, i));
        }
        File parentFile = file.getParentFile();
        if (!(parentFile == null || (listFiles = parentFile.listFiles()) == null)) {
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (name.startsWith(A012)) {
                    boolean endsWith = name.endsWith(A022);
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            String str = strArr[i2];
                            if (endsWith) {
                                break;
                            }
                            endsWith = name.endsWith(str);
                            i2++;
                        } else if (!endsWith) {
                        }
                    }
                    if (name.length() > A012.length() + pattern.length()) {
                        A0I.add(file2);
                    }
                }
            }
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            File A0S = C90524aI.A0S(AnonymousClass000.A0p(file.getPath(), AnonymousClass001.A0C(it), AnonymousClass000.A0u()));
            if (A0S.exists()) {
                A0I.add(A0S);
            }
        }
        Collections.sort(A0I, new AnonymousClass76K(A012, simpleDateFormat));
        return A0I;
    }

    public static void A0E(File file, ArrayList arrayList) {
        Collections.sort(arrayList, new AnonymousClass76K(AnonymousClass6UF.A01(file.getName()), new SimpleDateFormat("yyyy-MM-dd", Locale.US)));
    }

    public static boolean A0F(C99934uC r4, String str) {
        if (AnonymousClass000.A1P(r4.bitField0_ & 8)) {
            C100094uS r0 = r4.backupMetadata_;
            C100094uS r1 = r0;
            if (r0 == null) {
                r0 = C100094uS.DEFAULT_INSTANCE;
            }
            if ((r0.bitField0_ & 4) != 0) {
                if (r1 == null) {
                    r1 = C100094uS.DEFAULT_INSTANCE;
                }
                String str2 = r1.jidSuffix_;
                if (!TextUtils.isEmpty(str2) && !str.endsWith(str2)) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("EncBackupUtils/has-jid-user-mismatch/expected-jid-user-ends-with: ");
                    A0u.append(str2);
                    C36321k7.A1P("  actual-jid-user: ", str, A0u);
                    return true;
                }
            }
        }
        return false;
    }

    public static int A01(String str, String str2) {
        if (str2.equals(str)) {
            return 0;
        }
        if (str.endsWith(".crypt")) {
            return 1;
        }
        String[] split = str.split(".crypt");
        if (split.length != 2) {
            C36321k7.A1P("msgstore/get-version/unexpected-filename ", str, AnonymousClass000.A0u());
            return -1;
        }
        try {
            return Integer.parseInt(split[1]);
        } catch (NumberFormatException e) {
            Log.e(C36321k7.A0D("msgstore/get-version/unexpected-filename ", str), e);
            return -1;
        }
    }

    public static C1259862c A04(Context context) {
        File A0w = C36441kJ.A0w(context.getFilesDir(), "key");
        if (!A0w.exists()) {
            Log.w("backupkey/getinfo/does-not-exist");
        } else {
            byte[] A0J = C18750th.A0J(A0w);
            if (A0J != null) {
                int length = A0J.length;
                byte[] bArr = A00;
                if (length >= 131) {
                    byte[] bArr2 = new byte[2];
                    System.arraycopy(A0J, 0, bArr2, 0, 2);
                    if (Arrays.equals(bArr2, bArr)) {
                        String valueOf = String.valueOf(A0J[2]);
                        byte[] bArr3 = new byte[32];
                        System.arraycopy(A0J, 3, bArr3, 0, 32);
                        byte[] bArr4 = new byte[16];
                        System.arraycopy(A0J, 35, bArr4, 0, 16);
                        byte[] bArr5 = new byte[32];
                        System.arraycopy(A0J, 51, bArr5, 0, 32);
                        byte[] A0H = C18750th.A0H(16);
                        byte[] bArr6 = new byte[32];
                        System.arraycopy(A0J, 99, bArr6, 0, 32);
                        return new C1259862c(valueOf, bArr2, bArr3, bArr4, bArr5, A0H, bArr6);
                    }
                    throw new C18890tz();
                }
                throw new InvalidParameterException(AnonymousClass000.A0q(" size mismatch", C36381kD.A11(A0w)));
            }
        }
        return null;
    }

    public static String A05(AnonymousClass5U6 r2) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(".crypt");
        return C36381kD.A10(A0u, r2.version);
    }

    public static ArrayList A06(AnonymousClass5U6 r4) {
        AnonymousClass5U6 A002 = AnonymousClass5U6.A00();
        if (r4.version <= A002.version) {
            ArrayList A14 = C36441kJ.A14(r3);
            for (AnonymousClass5U6 A05 : AnonymousClass5U6.A05(r4, A002)) {
                A14.add(A05(A05));
            }
            A14.add(A05(AnonymousClass5U6.UNENCRYPTED));
            return A14;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("msgstore/get-db-crypt-extension-range/illegal-range [");
        A0u.append(r4);
        C90504aG.A1M(A0u);
        A0u.append(A002);
        throw AnonymousClass000.A0c(")", A0u);
    }

    public static void A09(Context context) {
        C36441kJ.A0w(context.getFilesDir(), "key").delete();
    }

    public static void A0B(Context context, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        C36321k7.A1Q("backupkey/set/v=", str, AnonymousClass000.A0u());
        Arrays.toString(bArr);
        Arrays.toString(bArr2);
        File A0w = C36441kJ.A0w(context.getFilesDir(), "key");
        byte[] bArr5 = new byte[16];
        Arrays.toString(bArr5);
        byte[] bArr6 = {Byte.parseByte(str)};
        byte[] bArr7 = A00;
        byte[] bArr8 = new byte[(3 + bArr.length + bArr4.length + bArr3.length + 16 + bArr2.length)];
        byte[][] bArr9 = new byte[7][];
        bArr9[0] = bArr7;
        C90464aC.A1D(bArr6, bArr, bArr4, bArr9);
        C36381kD.A1L(bArr3, bArr5, bArr9);
        bArr9[6] = bArr2;
        int i = 0;
        int i2 = 0;
        do {
            byte[] bArr10 = bArr9[i];
            System.arraycopy(bArr10, 0, bArr8, i2, bArr10.length);
            i2 += bArr10.length;
            i++;
        } while (i < 7);
        Arrays.toString(bArr8);
        try {
            C18750th.A0A(A0w, bArr8);
            byte[] A0J = C18750th.A0J(A0w);
            A04(context);
            Arrays.equals(bArr8, A0J);
        } catch (Exception e) {
            Log.e("backupkey/set/unable-to-write ", e);
        }
    }

    public static void A0D(AnonymousClass179 r4) {
        File[] listFiles = r4.A03().listFiles(AnonymousClass724.A00);
        if (listFiles != null) {
            for (File A0P : listFiles) {
                AnonymousClass6YY.A0P(A0P);
            }
        }
        File[] listFiles2 = r4.A02().listFiles();
        if (listFiles2 != null) {
            for (File A0P2 : listFiles2) {
                AnonymousClass6YY.A0P(A0P2);
            }
        }
    }

    public static byte[] A0G(byte[] bArr) {
        MessageDigest messageDigest;
        Arrays.toString(bArr);
        try {
            messageDigest = C90504aG.A0s();
        } catch (NoSuchAlgorithmException e) {
            Log.e("calculateahash/digester ", e);
            messageDigest = null;
        }
        if (messageDigest == null) {
            Log.e("calculateahash/digester is null");
            return null;
        }
        messageDigest.reset();
        messageDigest.update(bArr);
        return messageDigest.digest();
    }
}
