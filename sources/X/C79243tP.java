package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.GifHelper;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: X.3tP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C79243tP implements AnonymousClass4SG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ Uri A03;
    public final /* synthetic */ C225014r A04;
    public final /* synthetic */ AnonymousClass4UL A05;
    public final /* synthetic */ AnonymousClass1XY A06;
    public final /* synthetic */ AnonymousClass3XT A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;

    public /* synthetic */ C79243tP(Context context, Uri uri, C225014r r3, AnonymousClass4UL r4, AnonymousClass1XY r5, AnonymousClass3XT r6, String str, List list, int i, int i2) {
        this.A06 = r5;
        this.A03 = uri;
        this.A02 = context;
        this.A09 = list;
        this.A01 = i;
        this.A08 = str;
        this.A07 = r6;
        this.A05 = r4;
        this.A00 = i2;
        this.A04 = r3;
    }

    public final void BXw(File file) {
        AnonymousClass1XY r13 = this.A06;
        Uri uri = this.A03;
        Context context = this.A02;
        List list = this.A09;
        int i = this.A01;
        String str = this.A08;
        AnonymousClass3XT r15 = this.A07;
        AnonymousClass4UL r14 = this.A05;
        int i2 = this.A00;
        C225014r r5 = this.A04;
        try {
            String queryParameter = uri.getQueryParameter("doodle");
            AnonymousClass6VQ r0 = null;
            if (queryParameter != null) {
                File A0H = AnonymousClass1GW.A0H(r13.A00, queryParameter);
                r0 = C130956Nc.A00(context, r13.A04, r13.A05, r13.A0D, A0H);
                if (r0 != null) {
                    r0.A03 = queryParameter;
                } else {
                    throw AnonymousClass001.A0A("Doodle object is null");
                }
            }
            File file2 = file;
            if (!r13.A08(r14, r15, r0, (AnonymousClass3T1) null, file2, str, list, i, i2, GifHelper.A01(file2))) {
                r13.A01.A06(R.string.f12nameremoved, 0);
            }
            r14.Bk1(uri);
        } catch (IOException | NullPointerException e) {
            if (e.getMessage() == null || !e.getMessage().contains("No space")) {
                r13.A01.A06(R.string.f12nameremoved, 0);
            } else {
                r13.A01.A0D(r5, context.getString(R.string.f12nameremoved));
            }
            Log.e("sendmedia/sendvideo/error ", e);
        }
    }
}
