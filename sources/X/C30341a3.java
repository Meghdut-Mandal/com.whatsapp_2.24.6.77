package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.google.android.gms.tasks.zzw;
import com.whatsapp.util.Log;

/* renamed from: X.1a3  reason: invalid class name and case insensitive filesystem */
public class C30341a3 implements C236319f {
    public final C30331a2 A00;

    public int[] BCF() {
        return new int[]{179, 223};
    }

    public boolean BJl(Message message, int i) {
        String str;
        zzw A002;
        B9B b9b;
        if (i == 179) {
            Bundle data = message.getData();
            String string = data.getString("nonce");
            C18740tg.A06(string);
            String string2 = data.getString("apiKey");
            C18740tg.A06(string2);
            C30331a2 r3 = this.A00;
            Context context = r3.A00.A00;
            int A003 = C34201gc.A00(context);
            if (A003 == 0) {
                C98734rw r0 = new C98734rw(context);
                byte[] bytes = string.getBytes();
                AnonymousClass0XK r02 = r0.A05;
                C170478Do r2 = new C170478Do(r02, string2, bytes);
                r02.A05(r2);
                A002 = C06910Vo.A00(r2, new C10430eE(new AnonymousClass8BL()));
                A002.addOnSuccessListener(new A4N(r3));
                b9b = new B9B(r3, 0);
            } else {
                C30321a1 r4 = r3.A01;
                StringBuilder sb = new StringBuilder();
                sb.append("Google Play Services Unavailable. Connection result code: ");
                sb.append(A003);
                r4.A01((String) null, 1001, sb.toString());
                str = "requestAttestation/cannot request attestation Google APIs unavailable";
                Log.i(str);
                return true;
            }
        } else if (i != 223) {
            return false;
        } else {
            int i2 = message.getData().getInt("maxAppsCount");
            C30331a2 r32 = this.A00;
            Context context2 = r32.A00.A00;
            int A004 = C34201gc.A00(context2);
            if (A004 == 0) {
                AnonymousClass0XK r03 = new C98734rw(context2).A05;
                C170468Dn r22 = new C170468Dn(r03);
                r03.A05(r22);
                A002 = C06910Vo.A00(r22, new C10430eE(new AnonymousClass8BM()));
                A002.addOnSuccessListener(new A4O(r32, i2));
                b9b = new B9B(r32, 1);
            } else {
                C30321a1 r33 = r32.A01;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Google Play Services Unavailable. Connection result code: ");
                sb2.append(A004);
                r33.A00(sb2.toString(), 1001);
                str = "requestHarmfulApps/Google APIs unavailable";
                Log.i(str);
                return true;
            }
        }
        A002.addOnFailureListener(b9b);
        return true;
    }

    public C30341a3(C30331a2 r1) {
        this.A00 = r1;
    }
}
