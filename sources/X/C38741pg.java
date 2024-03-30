package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: X.1pg  reason: invalid class name and case insensitive filesystem */
public abstract class C38741pg extends LinearLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.whatsapp.BoundedLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.whatsapp.components.MaxHeightLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.whatsapp.BoundedLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.whatsapp.BoundedLinearLayout} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof com.whatsapp.conversation.conversationrow.dynamicview.DynamicMessageView
            if (r0 == 0) goto L_0x0029
            r2 = r3
            com.whatsapp.conversation.conversationrow.dynamicview.DynamicMessageView r2 = (com.whatsapp.conversation.conversationrow.dynamicview.DynamicMessageView) r2
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x0028
            r0 = 1
            r2.A06 = r0
            java.lang.Object r0 = r2.generatedComponent()
            X.0tq r1 = X.C36391kE.A0W(r0)
            X.1X4 r0 = X.C36361kB.A0T(r1)
            r2.A00 = r0
            X.0wG r0 = X.C36351kA.A0W(r1)
            r2.A01 = r0
            X.0ts r0 = X.C36341k9.A0T(r1)
            r2.A02 = r0
        L_0x0028:
            return
        L_0x0029:
            boolean r0 = r3 instanceof com.whatsapp.components.MaxHeightLinearLayout
            if (r0 == 0) goto L_0x003b
            r1 = r3
            com.whatsapp.components.MaxHeightLinearLayout r1 = (com.whatsapp.components.MaxHeightLinearLayout) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0028
            r0 = 1
            r1.A00 = r0
        L_0x0037:
            r1.generatedComponent()
            return
        L_0x003b:
            boolean r0 = r3 instanceof com.whatsapp.BoundedLinearLayout
            if (r0 == 0) goto L_0x004a
            r1 = r3
            com.whatsapp.BoundedLinearLayout r1 = (com.whatsapp.BoundedLinearLayout) r1
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0028
            r0 = 1
            r1.A02 = r0
            goto L_0x0037
        L_0x004a:
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0028
            r0 = 1
            r3.A01 = r0
            r3.generatedComponent()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38741pg.A01():void");
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C38741pg(Context context) {
        super(context);
        A01();
    }

    public C38741pg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public C38741pg(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
    }

    public C38741pg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }
}
