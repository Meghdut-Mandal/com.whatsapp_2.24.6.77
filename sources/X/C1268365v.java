package X;

import android.graphics.RectF;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.65v  reason: invalid class name and case insensitive filesystem */
public final class C1268365v {
    public final List A00 = AnonymousClass001.A0I();

    public final C129196Ft A00(List list) {
        C129196Ft r1;
        int i;
        C129196Ft r0;
        AnonymousClass00C.A0D(list, 0);
        List list2 = this.A00;
        if (!list2.isEmpty()) {
            C131476Pe r3 = (C131476Pe) AnonymousClass03Y.A0A(list2);
            if (r3 instanceof AnonymousClass5Cs) {
                AnonymousClass5Cs r02 = (AnonymousClass5Cs) r3;
                C122675vF r12 = r02.A00;
                if (!(r12 == null || (r0 = r02.A00) == null)) {
                    r0.A0K(r12);
                }
            } else {
                if (r3 instanceof AnonymousClass5Cr) {
                    AnonymousClass5Cr r03 = (AnonymousClass5Cr) r3;
                    r1 = r03.A00;
                    if (r1 != null) {
                        i = r03.A00;
                    }
                } else if (r3 instanceof AnonymousClass5Cq) {
                    AnonymousClass5Cq r04 = (AnonymousClass5Cq) r3;
                    r1 = r04.A00;
                    if (r1 != null) {
                        list.remove(r1);
                        i = r04.A00;
                    }
                } else {
                    C07710Yz.A00(list).remove(r3.A00);
                }
                list.add(i, r1);
            }
            if ((r3 instanceof AnonymousClass5Cr) && C36401kF.A1a(list2)) {
                C131476Pe r13 = (C131476Pe) C007103b.A0N(list2);
                if ((r13 instanceof AnonymousClass5Cs) && r13.A00 == r3.A00) {
                    A00(list);
                }
            } else if (r3 instanceof AnonymousClass5Cp) {
                return r3.A00;
            }
        }
        return null;
    }

    public final String A01(List list) {
        String str;
        int i;
        String str2;
        C104935Ca r5;
        AnonymousClass00C.A0D(list, 0);
        JSONArray A0u = C90524aI.A0u();
        for (C131476Pe r3 : this.A00) {
            JSONObject A1B = C36441kJ.A1B();
            A1B.put("shape_index", list.indexOf(r3.A00));
            boolean z = r3 instanceof AnonymousClass5Cs;
            if (z) {
                str = "undo_modify_shape";
            } else if (r3 instanceof AnonymousClass5Cr) {
                str = "undo_delete_shape";
            } else if (r3 instanceof AnonymousClass5Cq) {
                str = "undo_change_z_order";
            } else {
                str = "undo_add_shape";
            }
            A1B.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            if (z) {
                AnonymousClass5Cs r32 = (AnonymousClass5Cs) r3;
                C122675vF r6 = r32.A00;
                if (r6 != null) {
                    A1B.put("color", r6.A02);
                    A1B.put("rotate", (double) r6.A00);
                    A1B.put("strokeWidth", (double) r6.A01);
                    RectF rectF = r6.A03;
                    A1B.put("left", (double) rectF.left);
                    A1B.put("right", (double) rectF.right);
                    A1B.put("top", (double) rectF.top);
                    A1B.put("bottom", (double) rectF.bottom);
                    C122675vF r52 = r32.A00;
                    if ((r52 instanceof C104935Ca) && (r5 = (C104935Ca) r52) != null) {
                        A1B.put("text", r5.A05);
                        A1B.put("text-size", (double) r5.A00);
                        A1B.put("fontStyle", r5.A03);
                        A1B.put("alignment", r5.A01);
                        A1B.put("background_style", r5.A02);
                        i = r5.A04;
                        str2 = "min_layout_width";
                    }
                }
                A0u.put(A1B);
            } else if (r3 instanceof AnonymousClass5Cr) {
                i = ((AnonymousClass5Cr) r3).A00;
                str2 = "index";
            } else {
                A0u.put(A1B);
            }
            A1B.put(str2, i);
            A0u.put(A1B);
        }
        JSONObject A1B2 = C36441kJ.A1B();
        A1B2.put("version", 1);
        A1B2.put("actions", A0u);
        return C36381kD.A0y(A1B2);
    }
}
