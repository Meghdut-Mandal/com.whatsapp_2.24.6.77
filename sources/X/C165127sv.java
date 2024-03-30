package X;

/* renamed from: X.7sv  reason: invalid class name and case insensitive filesystem */
public class C165127sv implements C157987fc, C16960qU {
    public Object A00;
    public final int A01;

    public C165127sv(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final AnonymousClass00P BC8() {
        Class cls;
        int i;
        String str;
        String str2;
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            cls = C128866Dx.class;
            i = 3;
            str = "onSelected";
            str2 = "onSelected(ILcom/whatsapp/biz/catalog/view/variants/VariantsDisplayData;Lcom/whatsapp/biz/catalog/data/variants/ProductVariantProperty;)V";
        } else {
            cls = C95444ky.class;
            i = 3;
            str = "setSelectedVariant";
            str2 = "setSelectedVariant(ILcom/whatsapp/biz/catalog/view/variants/VariantsDisplayData;Lcom/whatsapp/biz/catalog/data/variants/ProductVariantProperty;)V";
        }
        return new C03030Cw(i, obj, cls, str, str2, 0);
    }

    public final void BKz(C134606bJ r7, C134746bX r8, int i) {
        C28201Rs r1;
        boolean A0j;
        if (this.A01 != 0) {
            AnonymousClass00C.A0D(r8, 1);
            C128866Dx r4 = (C128866Dx) this.A00;
            C134606bJ A012 = C129376Gr.A01(r8, i);
            AnonymousClass63M r3 = r4.A06;
            if (r3 == null) {
                throw C36331k8.A0d("titleController");
            }
            String str = A012.A01;
            C134656bO A002 = C129376Gr.A00(A012, r7, r8.A02);
            boolean z = true;
            if (A002 == null || !A002.A02) {
                z = false;
            }
            r3.A00(str, z);
            r4.A04.BKz(r7, r8, i);
            return;
        }
        AnonymousClass00C.A0D(r8, 1);
        C95444ky r2 = (C95444ky) this.A00;
        C134606bJ A013 = C129376Gr.A01(r8, i);
        if (C129376Gr.A00(A013, r7, r8.A02) == null && r8.A03.get(A013) == null) {
            r1 = r2.A02;
            A0j = true;
        } else {
            C36341k9.A17(r2.A01, i);
            r1 = r2.A02;
            A0j = C36381kD.A0j();
        }
        r1.A0C(A0j);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C157987fc) || !(obj instanceof C16960qU)) {
            return false;
        }
        return AnonymousClass00C.A0J(BC8(), ((C16960qU) obj).BC8());
    }

    public final int hashCode() {
        return BC8().hashCode();
    }
}
