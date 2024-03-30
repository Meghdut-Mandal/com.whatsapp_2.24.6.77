package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$documentUpload$1;
import com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$upload$1;
import com.whatsapp.smartcapture.picker.OpenDocumentPickerManagerImpl;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.505  reason: invalid class name */
public final class AnonymousClass505 extends C142266ob {
    public final C123485wZ A00;

    public AnonymousClass505(C123485wZ r4) {
        super("authenticity.action.Upload", "bk.action.authenticity.DocumentPicker", "bk.action.authenticity.DocumentUpload");
        this.A00 = r4;
    }

    public static final AnonymousClass01G A00(C100674vP r3) {
        Context context;
        C1271967i r32 = r3.A00;
        if (r32 != null) {
            context = r32.A00;
        } else {
            context = null;
        }
        if (context instanceof AnonymousClass01G) {
            return (AnonymousClass01G) context;
        }
        if (r32 == null) {
            return null;
        }
        Object obj = r32.A02.A00().get(R.id.bloks_host_activity);
        if (obj instanceof AnonymousClass01G) {
            return (AnonymousClass01G) obj;
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Object B6u(AnonymousClass6MO r19, C115215iW r20, C124125xd r21) {
        C100674vP r0 = (C100674vP) r21;
        AnonymousClass6MO r3 = r19;
        C115215iW r1 = r20;
        boolean A1a = C36341k9.A1a(r1, r3);
        AnonymousClass00C.A0D(r0, 2);
        String str = r1.A00;
        if (str == null) {
            return null;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1509532004) {
            if (hashCode != 978011219) {
                if (hashCode != 1127893446 || !str.equals("bk.action.authenticity.DocumentUpload")) {
                    return null;
                }
                C160377ku A002 = AnonymousClass6JJ.A00(r3, 0);
                C160377ku A003 = AnonymousClass6JJ.A00(r3, A1a);
                C160377ku A004 = AnonymousClass6JJ.A00(r3, 2);
                List list = r3.A00;
                String A0s = C36401kF.A0s(list, 3);
                String A0s2 = C36401kF.A0s(list, 4);
                AnonymousClass01G A005 = A00(r0);
                if (A005 == null) {
                    return null;
                }
                C123485wZ r11 = this.A00;
                AnonymousClass00C.A0B(A0s2);
                AnonymousClass00C.A0B(A0s);
                AnonymousClass7UC r32 = new AnonymousClass7UC(r0, A002);
                C153157Ng r15 = new C153157Ng(r0, A004);
                AnonymousClass7UD r2 = new AnonymousClass7UD(r0, A003);
                AnonymousClass00C.A0D(A0s2, 1);
                AnonymousClass00C.A0D(A0s, 2);
                C36381kD.A1R(r11.A03, new WaAuthenticityInterpreterCallbackImpl$documentUpload$1(A005, r11, A0s2, A0s, (C023509x) null, r15, r32, r2), C33311f5.A00(A005));
            } else if (!str.equals("bk.action.authenticity.DocumentPicker")) {
                return null;
            } else {
                r3.A00.get(0);
                C160377ku A006 = AnonymousClass6JJ.A00(r3, A1a);
                C160377ku A007 = AnonymousClass6JJ.A00(r3, 2);
                C160377ku A008 = AnonymousClass6JJ.A00(r3, 3);
                AnonymousClass01G A009 = A00(r0);
                if (A009 == null) {
                    return null;
                }
                C123485wZ r4 = this.A00;
                AnonymousClass7UA r33 = new AnonymousClass7UA(r0, A006);
                C153147Nf r22 = new C153147Nf(r0, A007);
                AnonymousClass7UB r12 = new AnonymousClass7UB(r0, A008);
                OpenDocumentPickerManagerImpl openDocumentPickerManagerImpl = r4.A01;
                C155097Ut r42 = new C155097Ut(r22, r33, r12);
                A009.A06.A04(openDocumentPickerManagerImpl);
                C18100sc A02 = A009.A04.A02(new C165437tQ(A009, openDocumentPickerManagerImpl, r42, 0), new AnonymousClass0FH(), "documentpicker_rq#101");
                openDocumentPickerManagerImpl.A00 = A02;
                A02.A01((AnonymousClass0YW) null, OpenDocumentPickerManagerImpl.A01);
            }
            return AnonymousClass0AJ.A00;
        } else if (!str.equals("authenticity.action.Upload")) {
            return null;
        } else {
            Object A0010 = AnonymousClass6MO.A00(r3, A1a ? 1 : 0);
            Objects.requireNonNull(A0010);
            AnonymousClass00C.A08(A0010);
            Map map = (Map) A0010;
            Object A0011 = AnonymousClass6MO.A00(r3, 2);
            Objects.requireNonNull(A0011);
            AnonymousClass00C.A08(A0011);
            Map map2 = (Map) A0011;
            C160377ku A0012 = AnonymousClass6JJ.A00(r3, 3);
            C160377ku A0013 = AnonymousClass6JJ.A00(r3, 4);
            String A022 = AnonymousClass6MO.A02(r3, 5);
            Object A0014 = AnonymousClass6MO.A00(r3, 6);
            Objects.requireNonNull(A0014);
            C140456lc r7 = (C140456lc) A0014;
            AnonymousClass00C.A0B(r7);
            long A0U = r7.A0U(38, 0);
            AnonymousClass01G A0015 = A00(r0);
            if (A0015 == null) {
                return null;
            }
            C123485wZ r72 = this.A00;
            AnonymousClass7U8 r122 = new AnonymousClass7U8(r0, A0012);
            AnonymousClass7U9 r13 = new AnonymousClass7U9(r0, A0013);
            AnonymousClass00C.A0B(A022);
            C36321k7.A0x(map, map2);
            AnonymousClass00C.A0D(A022, 5);
            C36381kD.A1R(r72.A03, new WaAuthenticityInterpreterCallbackImpl$upload$1(r72, A022, map, map2, (C023509x) null, r122, r13, A0U), C33311f5.A00(A0015));
            return null;
        }
    }
}
