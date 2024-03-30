package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.DragEvent;
import android.view.View;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9v6  reason: invalid class name */
public class AnonymousClass9v6 implements View.OnDragListener {
    public C176478cB A00;
    public final C25491Gn A01;
    public final Activity A02;
    public final A8W A03;
    public final C19970wo A04;
    public final C21010yW A05;

    public AnonymousClass9v6(Context context, A8W a8w, C19970wo r4, C21010yW r5, C25491Gn r6) {
        this.A03 = a8w;
        this.A02 = C24801Dv.A00(context);
        this.A04 = r4;
        this.A05 = r5;
        this.A01 = r6;
    }

    public boolean onDrag(View view, DragEvent dragEvent) {
        String str;
        ClipData.Item itemAt;
        String str2;
        int action = dragEvent.getAction();
        if (action == 1) {
            view.setVisibility(0);
            view.setBackgroundColor(-2134061876);
            C176478cB r1 = new C176478cB();
            this.A00 = r1;
            r1.A07 = C36361kB.A0l();
            this.A00.A04 = C90484aE.A0g();
            return true;
        } else if (action == 3) {
            if (Build.VERSION.SDK_INT >= 24) {
                this.A02.requestDragAndDropPermissions(dragEvent);
            }
            C176358bz r4 = new C176358bz();
            C176478cB r5 = this.A00;
            r4.A04 = r5.A07;
            if (dragEvent.getClipData() != null) {
                Long A0y = C36441kJ.A0y(dragEvent.getClipData().getItemCount());
                r5.A05 = A0y;
                r4.A01 = A0y;
                HashSet A16 = C36441kJ.A16();
                for (int i = 0; i < dragEvent.getClipData().getItemCount(); i++) {
                    Uri uri = dragEvent.getClipData().getItemAt(i).getUri();
                    if (uri != null) {
                        int A002 = this.A01.A00(uri);
                        if (A002 == -1) {
                            str2 = "invalid";
                        } else if (A002 == 9) {
                            str2 = "document";
                        } else if (A002 == 13) {
                            str2 = "gif";
                        } else if (A002 == 1) {
                            str2 = "photo";
                        } else if (A002 == 2) {
                            str2 = "audio";
                        } else if (A002 == 3) {
                            str2 = "video";
                        } else if (A002 != 4) {
                            str2 = "none";
                        } else {
                            str2 = "contact";
                        }
                        A16.add(str2);
                    }
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                Iterator it = A16.iterator();
                while (it.hasNext()) {
                    A0u.append(AnonymousClass001.A0C(it));
                    A0u.append(",");
                }
                String obj = A0u.toString();
                r5.A06 = obj;
                r4.A03 = obj;
            }
            A8W a8w = this.A03;
            ClipData clipData = dragEvent.getClipData();
            a8w.A00 = r4;
            if (clipData != null && clipData.getDescription() != null) {
                if (!clipData.getDescription().hasMimeType("text/plain") && !clipData.getDescription().hasMimeType("text/html")) {
                    ArrayList A0I = AnonymousClass001.A0I();
                    for (int i2 = 0; i2 < clipData.getItemCount(); i2++) {
                        ClipData.Item itemAt2 = clipData.getItemAt(i2);
                        if (!(itemAt2 == null || itemAt2.getUri() == null)) {
                            A0I.add(itemAt2.getUri());
                        }
                    }
                    Iterator it2 = A0I.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            A8W.A00(a8w, A0I);
                            break;
                        }
                        if (a8w.A0A.A00((Uri) it2.next()) == 9) {
                            AnonymousClass141 A08 = a8w.A04.A08(a8w.A09);
                            AnonymousClass171 r7 = a8w.A05;
                            Activity activity = a8w.A02;
                            AnonymousClass1H2 r9 = a8w.A07;
                            C55852vI.A00(activity, new B87(a8w, 3), new B8F(A0I, a8w, 2), new B83(a8w, 5), r7, A08, r9, A0I, (Map) null).show();
                            break;
                        }
                    }
                } else {
                    if (clipData.getItemCount() != 1 || (itemAt = clipData.getItemAt(0)) == null || itemAt.getText() == null) {
                        str = "";
                    } else {
                        str = itemAt.getText().toString();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        a8w.A0B.setText(str);
                    }
                }
            } else {
                a8w.A03.A06(R.string.f12nameremoved, 0);
                C176358bz r3 = a8w.A00;
                r3.A00 = C36381kD.A0j();
                r3.A02 = "clip_data_or_clip_description_null";
                a8w.A08.Bly(r3);
            }
            this.A00.A00 = C90484aE.A0g();
            return true;
        } else if (action == 4) {
            view.setBackgroundColor(0);
            C176478cB r12 = this.A00;
            r12.A01 = C90484aE.A0g();
            this.A05.Bly(r12);
            return true;
        } else if (action == 5) {
            view.setBackgroundColor(-2131824914);
            this.A00.A02 = C90484aE.A0g();
            return true;
        } else if (action != 6) {
            return false;
        } else {
            view.setBackgroundColor(-2134061876);
            this.A00.A03 = C90484aE.A0g();
            return true;
        }
    }
}
