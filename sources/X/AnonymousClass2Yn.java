package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.2Yn  reason: invalid class name */
public final class AnonymousClass2Yn extends C42541yz implements AnonymousClass4OM {
    public final RecyclerView A00;
    public final C76003oA A01;
    public final C32131d1 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2Yn(View view, AnonymousClass3CE r4, AnonymousClass1RY r5, C32131d1 r6) {
        super(view);
        C36321k7.A0y(r4, r5);
        this.A02 = r6;
        RecyclerView A0c = C36441kJ.A0c(view, R.id.directory_categories_recommended_newsletters_list);
        this.A00 = A0c;
        AnonymousClass00C.A06(A0c);
        C76003oA A002 = r4.A00(A0c, r5, r6, false);
        this.A01 = A002;
        A002.A00();
    }
}
