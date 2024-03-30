package X;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment;
import java.util.List;

/* renamed from: X.7U6  reason: invalid class name */
public final class AnonymousClass7U6 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ Bundle $savedInstanceState;
    public final /* synthetic */ BlockReasonListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7U6(Bundle bundle, BlockReasonListFragment blockReasonListFragment) {
        super(1);
        this.this$0 = blockReasonListFragment;
        this.$savedInstanceState = bundle;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        AnonymousClass00C.A0D(list, 0);
        BlockReasonListFragment blockReasonListFragment = this.this$0;
        AnonymousClass1H2 r6 = blockReasonListFragment.A09;
        if (r6 != null) {
            C21060yb r3 = blockReasonListFragment.A07;
            if (r3 != null) {
                C18820ts r4 = blockReasonListFragment.A01;
                AnonymousClass00C.A08(r4);
                BlockReasonListFragment blockReasonListFragment2 = this.this$0;
                C19890wg r7 = blockReasonListFragment2.A0B;
                if (r7 != null) {
                    AnonymousClass1N0 r5 = blockReasonListFragment2.A08;
                    if (r5 != null) {
                        blockReasonListFragment.A03 = new C96054mi(r3, r4, r5, r6, r7, list, new AnonymousClass7S2(blockReasonListFragment2), blockReasonListFragment2.A0F);
                        BlockReasonListFragment blockReasonListFragment3 = this.this$0;
                        Bundle bundle = this.$savedInstanceState;
                        if (bundle != null) {
                            int i = bundle.getInt("selectedItem");
                            String string = bundle.getString("text", "");
                            AnonymousClass00C.A08(string);
                            C96054mi r2 = blockReasonListFragment3.A03;
                            if (r2 == null) {
                                throw C36331k8.A0d("adapter");
                            }
                            r2.A00 = i;
                            r2.A01 = string;
                            Object A0P = C007103b.A0P(r2.A02, i);
                            if (A0P != null) {
                                r2.A03.invoke(A0P);
                            }
                            r2.A06();
                        }
                        BlockReasonListFragment blockReasonListFragment4 = this.this$0;
                        RecyclerView recyclerView = blockReasonListFragment4.A01;
                        if (recyclerView == null) {
                            throw C36331k8.A0d("recyclerView");
                        }
                        C96054mi r0 = blockReasonListFragment4.A03;
                        if (r0 == null) {
                            throw C36331k8.A0d("adapter");
                        }
                        recyclerView.setAdapter(r0);
                        return AnonymousClass0AJ.A00;
                    }
                    throw C36331k8.A0d("emojiRichFormatterStaticCaller");
                }
                throw C36331k8.A0d("sharedPreferencesFactory");
            }
            throw C36331k8.A0W();
        }
        throw C36331k8.A0d("emojiLoader");
    }
}
