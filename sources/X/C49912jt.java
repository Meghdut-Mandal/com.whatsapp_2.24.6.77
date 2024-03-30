package X;

import android.content.Intent;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.contentprovider.MediaProvider;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.2jt  reason: invalid class name and case insensitive filesystem */
public class C49912jt extends C132446Tt {
    public final C20690y0 A00;
    public final C19970wo A01;
    public final AnonymousClass4UG A02;
    public final C51622o7 A03;
    public final WeakReference A04;

    public C49912jt(C225314u r2, C20690y0 r3, C19970wo r4, AnonymousClass4UG r5, C51622o7 r6) {
        super(r2, true);
        this.A01 = r4;
        this.A00 = r3;
        this.A04 = AnonymousClass001.A0F(r2);
        this.A02 = r5;
        this.A03 = r6;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        File filesDir;
        String str;
        FileOutputStream fileOutputStream;
        C20690y0 r2 = this.A00;
        AnonymousClass6YY.A0E(r2.A0D(), 0);
        String A0l = C36361kB.A0l();
        C51622o7 r1 = this.A03;
        if (r1 == C51622o7.ACCOUNT) {
            filesDir = r2.A01.A00.getFilesDir();
            str = "gdpr.zip";
        } else {
            if (r1 == C51622o7.NEWSLETTER) {
                filesDir = r2.A01.A00.getFilesDir();
                str = "channels_gdpr.zip";
            }
            return null;
        }
        File A0w = C36441kJ.A0w(filesDir, str);
        File A0V = r2.A0V(A0l);
        try {
            FileInputStream fileInputStream = new FileInputStream(A0w);
            try {
                fileOutputStream = new FileOutputStream(A0V);
                AnonymousClass6YY.A0J(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
                if (A0V.setLastModified(C19970wo.A00(this.A01))) {
                    return A0l;
                }
                Log.e("gdprreportactivity/failed to update report file");
                return null;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
            throw th;
        } catch (IOException e) {
            Log.e("gdprreportactivity/can't prepare report file", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public void A0A() {
        C225314u A0W = C36411kG.A0W(this.A04);
        if (A0W != null && !A0W.BLh()) {
            this.A02.Bu2(0, R.string.f12nameremoved);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str;
        String str2 = (String) obj;
        C225314u A0W = C36411kG.A0W(this.A04);
        if (A0W != null && !A0W.BLh()) {
            AnonymousClass4UG r3 = this.A02;
            r3.Bnv();
            if (str2 != null) {
                C51622o7 r4 = this.A03;
                C224914p r32 = (C224914p) r3;
                Intent intent = new Intent("android.intent.action.SEND", Uri.parse("mailto:"));
                if (r4 == C51622o7.ACCOUNT) {
                    str = "gdpr_report";
                } else if (r4 == C51622o7.NEWSLETTER) {
                    str = "channels_gdpr_report";
                } else {
                    throw AnonymousClass001.A09(AnonymousClass000.A0l(r4, "MediaProvider/getGdprMediaUri/unexpected gdprReportType: ", AnonymousClass000.A0u()));
                }
                intent.putExtra("android.intent.extra.STREAM", MediaProvider.A04(str, str2));
                C36371kC.A18(intent, "application/zip");
                r32.startActivityForResult(Intent.createChooser(intent, (CharSequence) null), 0);
            }
        }
    }
}
