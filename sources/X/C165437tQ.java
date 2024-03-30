package X;

import com.whatsapp.smartcapture.picker.OpenDocumentPickerManagerImpl;
import com.whatsapp.smartcapture.picker.OpenMediaPickerManagerImpl;

/* renamed from: X.7tQ  reason: invalid class name and case insensitive filesystem */
public class C165437tQ implements C009604b {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C165437tQ(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void BQj(Object obj) {
        int i = this.A03;
        C006302t r4 = (C006302t) this.A00;
        Object obj2 = this.A01;
        if (i != 0) {
            OpenMediaPickerManagerImpl openMediaPickerManagerImpl = (OpenMediaPickerManagerImpl) obj2;
            AnonymousClass01G r2 = (AnonymousClass01G) this.A02;
            AnonymousClass00C.A0D(r4, 0);
            if (obj != null) {
                try {
                    r4.invoke(new C106215Iu(C36381kD.A0y(obj)));
                } catch (SecurityException e) {
                    r4.invoke(new C106205It(e.toString()));
                }
            } else {
                r4.invoke(C106225Iv.A00);
            }
            C009904e r0 = openMediaPickerManagerImpl.A00;
            if (r0 != null) {
                r0.A00();
            }
            r2.A06.A05(openMediaPickerManagerImpl);
            return;
        }
        AnonymousClass01G r3 = (AnonymousClass01G) obj2;
        OpenDocumentPickerManagerImpl openDocumentPickerManagerImpl = (OpenDocumentPickerManagerImpl) this.A02;
        AnonymousClass00C.A0D(r4, 0);
        if (obj != null) {
            try {
                r4.invoke(new C106185Ir(C36381kD.A0y(obj)));
            } catch (SecurityException e2) {
                r4.invoke(new C106175Iq(e2.toString()));
            }
        } else {
            r4.invoke(C106195Is.A00);
        }
        r3.A06.A05(openDocumentPickerManagerImpl);
        C009904e r02 = openDocumentPickerManagerImpl.A00;
        if (r02 != null) {
            r02.A00();
        }
    }
}
