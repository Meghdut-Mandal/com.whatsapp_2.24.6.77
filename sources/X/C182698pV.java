package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.8pV  reason: invalid class name and case insensitive filesystem */
public abstract class C182698pV extends C166417vl {
    public C19460v5 A00;
    public C19730wQ A01;
    public AnonymousClass16D A02;
    public AnonymousClass171 A03;
    public C21060yb A04;
    public C19970wo A05;
    public C18820ts A06;
    public AnonymousClass1H2 A07;
    public C20810yC A08;
    public C19890wg A09;
    public final ViewGroup A0A = C36411kG.A0P(this, R.id.search_message_container_attachment);
    public final ViewGroup A0B = C36411kG.A0P(this, R.id.search_message_container_content);
    public final ViewGroup A0C = C36411kG.A0P(this, R.id.search_message_container_header);
    public final ViewGroup A0D = C36411kG.A0P(this, R.id.search_message_container_media);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.2dS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.2dU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.2dR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.2dT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: X.8pD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: X.7vs} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05() {
        /*
            r10 = this;
            r2 = r10
            X.8pU r2 = (X.C182688pU) r2
            android.content.Context r0 = r2.getContext()
            com.whatsapp.components.ConversationListRowHeaderView r6 = new com.whatsapp.components.ConversationListRowHeaderView
            r6.<init>(r0)
            X.C36321k7.A0N(r6)
            com.whatsapp.TextEmojiLabel r0 = r6.A00
            r1 = 0
            r0.setIncludeFontPadding(r1)
            com.whatsapp.WaTextView r0 = r6.A01
            r0.setIncludeFontPadding(r1)
            X.0yC r9 = r2.A08
            android.content.Context r4 = r2.getContext()
            X.0ts r8 = r2.A06
            X.171 r7 = r2.A03
            X.0v5 r5 = r2.A00
            X.9gu r3 = new X.9gu
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2.A02 = r3
            X.24G r0 = r3.A04
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            X.C33511fU.A03(r0)
            X.9gu r0 = r2.A02
            int r4 = r2.A06
            com.whatsapp.components.ConversationListRowHeaderView r0 = r0.A03
            com.whatsapp.WaTextView r0 = r0.A01
            r0.setTextColor(r4)
            android.view.ViewGroup r0 = r10.A0C
            r0.addView(r6)
            android.content.Context r1 = r2.getContext()
            com.whatsapp.TextEmojiLabel r0 = new com.whatsapp.TextEmojiLabel
            r0.<init>(r1)
            r2.A01 = r0
            r0 = -2
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r0, r0)
            r1 = 3
            r3.gravity = r1
            com.whatsapp.TextEmojiLabel r0 = r2.A01
            r0.setLayoutParams(r3)
            com.whatsapp.TextEmojiLabel r0 = r2.A01
            r0.setMaxLines(r1)
            com.whatsapp.TextEmojiLabel r1 = r2.A01
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r0)
            com.whatsapp.TextEmojiLabel r0 = r2.A01
            r0.setTextColor(r4)
            com.whatsapp.TextEmojiLabel r3 = r2.A01
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131168188(0x7f070bbc, float:1.795067E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.setLineHeight(r0)
            com.whatsapp.TextEmojiLabel r0 = r2.A01
            r0.A0C()
            com.whatsapp.TextEmojiLabel r0 = r2.A01
            X.C36391kE.A1K(r0)
            com.whatsapp.TextEmojiLabel r1 = r2.A01
            r0 = 80
            r1.setPlaceholder(r0)
            com.whatsapp.TextEmojiLabel r3 = r2.A01
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131168189(0x7f070bbd, float:1.7950673E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.setLineSpacing(r1, r0)
            com.whatsapp.TextEmojiLabel r1 = r2.A01
            r0 = 2131433645(0x7f0b18ad, float:1.8489082E38)
            r1.setId(r0)
            com.whatsapp.TextEmojiLabel r1 = r2.A01
            if (r1 == 0) goto L_0x00b3
            android.view.ViewGroup r0 = r10.A0B
            r0.addView(r1)
        L_0x00b3:
            r3 = r10
            boolean r0 = r10 instanceof X.C182618pN
            if (r0 == 0) goto L_0x010f
            X.8pN r3 = (X.C182618pN) r3
            android.content.Context r1 = r3.getContext()
            X.1f4 r0 = r3.A07
            X.7vs r4 = new X.7vs
            r4.<init>(r1, r0)
            r3.A00 = r4
        L_0x00c7:
            android.view.ViewGroup r1 = r10.A0A
            r1.addView(r4)
            r0 = 0
            r1.setVisibility(r0)
        L_0x00d0:
            r2 = r10
            boolean r0 = r10 instanceof X.C182658pR
            if (r0 == 0) goto L_0x00ef
            X.8pO r2 = (X.C182628pO) r2
            android.content.Context r0 = r2.getContext()
            X.5K1 r1 = new X.5K1
            r1.<init>(r0)
        L_0x00e0:
            r2.A00 = r1
            r2.setUpThumbView(r1)
            X.4zZ r1 = r2.A00
            if (r1 == 0) goto L_0x00ee
            android.view.ViewGroup r0 = r10.A0D
            r0.addView(r1)
        L_0x00ee:
            return
        L_0x00ef:
            boolean r0 = r10 instanceof X.C182648pQ
            if (r0 == 0) goto L_0x00ff
            X.8pO r2 = (X.C182628pO) r2
            android.content.Context r0 = r2.getContext()
            X.5Jy r1 = new X.5Jy
            r1.<init>(r0)
            goto L_0x00e0
        L_0x00ff:
            boolean r0 = r10 instanceof X.C182668pS
            if (r0 == 0) goto L_0x00ee
            X.8pO r2 = (X.C182628pO) r2
            android.content.Context r0 = r2.getContext()
            X.5Jz r1 = new X.5Jz
            r1.<init>(r0)
            goto L_0x00e0
        L_0x010f:
            boolean r0 = r10 instanceof X.C182678pT
            if (r0 == 0) goto L_0x0121
            X.8pT r3 = (X.C182678pT) r3
            android.content.Context r0 = r3.getContext()
            X.2dT r4 = new X.2dT
            r4.<init>(r0)
            r3.A02 = r4
            goto L_0x00c7
        L_0x0121:
            boolean r0 = r10 instanceof X.C182638pP
            if (r0 == 0) goto L_0x0133
            X.8pP r3 = (X.C182638pP) r3
            android.content.Context r0 = r3.getContext()
            X.2dR r4 = new X.2dR
            r4.<init>(r0)
            r3.A05 = r4
            goto L_0x00c7
        L_0x0133:
            boolean r0 = r10 instanceof X.C182558pH
            if (r0 == 0) goto L_0x0145
            X.8pH r3 = (X.C182558pH) r3
            android.content.Context r0 = r3.getContext()
            X.8pD r4 = new X.8pD
            r4.<init>(r0)
            r3.A00 = r4
            goto L_0x00c7
        L_0x0145:
            boolean r0 = r10 instanceof X.C182538pF
            if (r0 == 0) goto L_0x0154
            android.content.Context r0 = X.C36371kC.A0B(r10)
            X.8pE r4 = new X.8pE
            r4.<init>(r0)
            goto L_0x00c7
        L_0x0154:
            boolean r0 = r10 instanceof X.C182568pI
            if (r0 == 0) goto L_0x0169
            X.8pI r3 = (X.C182568pI) r3
            android.content.Context r1 = r3.getContext()
            X.1RY r0 = r3.A02
            X.2dU r4 = new X.2dU
            r4.<init>(r1, r0)
            r3.A00 = r4
            goto L_0x00c7
        L_0x0169:
            boolean r0 = r10 instanceof X.C182578pJ
            if (r0 == 0) goto L_0x0180
            X.8pJ r3 = (X.C182578pJ) r3
            android.content.Context r2 = r3.getContext()
            X.2XJ r1 = r3.A05
            X.1RY r0 = r3.A04
            X.2dS r4 = new X.2dS
            r4.<init>(r2, r0, r1)
            r3.A02 = r4
            goto L_0x00c7
        L_0x0180:
            boolean r0 = r10 instanceof X.C182548pG
            if (r0 == 0) goto L_0x00d0
            X.8pG r3 = (X.C182548pG) r3
            android.content.Context r0 = r3.getContext()
            X.8pC r4 = new X.8pC
            r4.<init>(r0)
            r3.A00 = r4
            goto L_0x00c7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C182698pV.A05():void");
    }

    public C182698pV(Context context) {
        super(context);
        setOrientation(0);
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        TypedValue typedValue = new TypedValue();
        C36361kB.A09(this).resolveAttribute(16843534, typedValue, true);
        setBackgroundResource(typedValue.resourceId);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
    }
}
