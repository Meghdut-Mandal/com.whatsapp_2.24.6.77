package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.infra.graphql.generated.textstatus.GetTextStatusListQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.textstatus.GetTextStatusListResponseImpl;
import com.whatsapp.infra.graphql.generated.textstatus.UpdateTextStatusMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.textstatus.UpdateTextStatusResponseImpl;
import com.whatsapp.infra.graphql.generated.textstatus.calls.XWA2TextStatusEmojiInput;
import com.whatsapp.infra.graphql.generated.textstatus.calls.XWA2TextStatusInput;
import com.whatsapp.infra.graphql.generated.textstatus.calls.XWA2TextStatusMutationInput;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1YZ  reason: invalid class name */
public final class AnonymousClass1YZ {
    public C19730wQ A00;
    public C19420v0 A01;
    public AnonymousClass3EB A02;
    public Boolean A03;
    public C27591Ow A04;
    public final AnonymousClass16I A05;
    public final AnonymousClass17Y A06;
    public final C19970wo A07;

    public AnonymousClass1YZ(AnonymousClass17Y r2, C19730wQ r3, AnonymousClass16I r4, C19970wo r5, C19420v0 r6, C27591Ow r7) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r7, 4);
        AnonymousClass00C.A0D(r4, 5);
        AnonymousClass00C.A0D(r6, 6);
        this.A07 = r5;
        this.A06 = r2;
        this.A00 = r3;
        this.A04 = r7;
        this.A05 = r4;
        this.A01 = r6;
    }

    public final void A01(long j, String str, long j2, String str2) {
        SharedPreferences.Editor A002 = C19420v0.A00(this.A01);
        A002.putString("my_current_evolved_about_text", str);
        A002.putString("my_current_evolved_about_emoji", str2);
        A002.putLong("my_current_evolved_about_duration", j);
        A002.putLong("my_current_evolved_about_set_timestamp", j2);
        if (TextUtils.isEmpty((CharSequence) null)) {
            A002.remove("my_current_evolved_about_hash");
        } else {
            A002.putString("my_current_evolved_about_hash", (String) null);
        }
        A002.apply();
        this.A06.A0H(new C35691j6(this, 46));
    }

    public final void A02(long j, String str, boolean z, String str2) {
        long j2 = j;
        this.A03 = Boolean.valueOf(z);
        String str3 = str2;
        A01(j2, str, C19970wo.A00(this.A07), str3);
        if (z) {
            j2 = -2;
        }
        XWA2TextStatusMutationInput xWA2TextStatusMutationInput = new XWA2TextStatusMutationInput();
        if (!(str == null || str.length() == 0)) {
            xWA2TextStatusMutationInput.A07("text", str);
        }
        if (str2 != null) {
            XWA2TextStatusEmojiInput xWA2TextStatusEmojiInput = new XWA2TextStatusEmojiInput();
            xWA2TextStatusEmojiInput.A07("content", str3);
            xWA2TextStatusMutationInput.A05(xWA2TextStatusEmojiInput, "emoji");
        }
        xWA2TextStatusMutationInput.A06("ephemeral_duration_sec", Integer.valueOf((int) j2));
        AnonymousClass9VA r3 = new UpdateTextStatusMutationImpl$Builder().A00;
        r3.A00(xWA2TextStatusMutationInput, "text_status_input");
        new C177268dW(new AnonymousClass4KN(this.A04.A01(new AnonymousClass9JF(r3, UpdateTextStatusResponseImpl.class, "UpdateTextStatus")))).A08(TimeUnit.MILLISECONDS, new C22386Aln(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0034, code lost:
        if (X.AnonymousClass098.A06(r13) == false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C63233Jg A00() {
        /*
            r17 = this;
            r8 = r17
            X.0v0 r0 = r8.A01
            X.005 r4 = r0.A00
            java.lang.Object r2 = r4.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r5 = "my_current_evolved_about_duration"
            r0 = 0
            long r2 = r2.getLong(r5, r0)
            java.lang.Object r6 = r4.get()
            android.content.SharedPreferences r6 = (android.content.SharedPreferences) r6
            java.lang.String r1 = "my_current_evolved_about_text"
            r0 = 0
            java.lang.String r13 = r6.getString(r1, r0)
            r10 = 0
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0036
            r6 = -1
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0037
            if (r13 == 0) goto L_0x0036
            boolean r0 = X.AnonymousClass098.A06(r13)
            if (r0 == 0) goto L_0x0057
        L_0x0036:
            return r10
        L_0x0037:
            X.0wo r0 = r8.A07
            long r8 = X.C19970wo.A00(r0)
            java.lang.Object r7 = r4.get()
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7
            java.lang.String r6 = "my_current_evolved_about_set_timestamp"
            r0 = 0
            long r6 = r7.getLong(r6, r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r0.toMillis(r2)
            long r6 = r6 + r0
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0057
            return r10
        L_0x0057:
            java.lang.Object r1 = r4.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "my_current_evolved_about_emoji"
            java.lang.String r16 = r1.getString(r0, r10)
            java.lang.Object r0 = r4.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            r1 = 0
            long r11 = r0.getLong(r5, r1)
            java.lang.Object r3 = r4.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r0 = "my_current_evolved_about_set_timestamp"
            long r14 = r3.getLong(r0, r1)
            X.3Jg r10 = new X.3Jg
            r10.<init>(r11, r13, r14, r16)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1YZ.A00():X.3Jg");
    }

    public final void A03(AnonymousClass3EB r5) {
        AnonymousClass11F r0;
        String rawString;
        boolean z;
        this.A02 = r5;
        C19730wQ r02 = this.A00;
        r02.A0G();
        AnonymousClass142 r03 = r02.A0E;
        if (r03 == null || (r0 = r03.A0H) == null || (rawString = r0.getRawString()) == null) {
            Log.e("Unable to fetch my jid");
            return;
        }
        XWA2TextStatusInput xWA2TextStatusInput = new XWA2TextStatusInput();
        xWA2TextStatusInput.A07("jid", rawString);
        xWA2TextStatusInput.A07("last_update_time", (String) null);
        C23931Ak of = C23931Ak.of(xWA2TextStatusInput);
        AnonymousClass9VA r3 = new GetTextStatusListQueryImpl$Builder().A00;
        if (of != null) {
            r3.A00.A08("input", of);
            z = true;
        } else {
            z = false;
        }
        C20740y5.A06(z);
        new C177268dW(new AnonymousClass4KN(this.A04.A01(new AnonymousClass9JF(r3, GetTextStatusListResponseImpl.class, "GetTextStatusList")))).A08(TimeUnit.MILLISECONDS, new C22385Alm(this));
    }
}
