package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.widget.RadioButton;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.whatsapp.mediacomposer.bottomsheet.MediaQualitySettingsBottomSheetFragment;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.search.views.TokenizedSearchInput;
import com.whatsapp.util.Log;

/* renamed from: X.7sq  reason: invalid class name and case insensitive filesystem */
public class C165077sq implements AnonymousClass00P, AnonymousClass00S {
    public Object A00;
    public final int A01;

    public C165077sq(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object invoke() {
        RadioButton radioButton;
        switch (this.A01) {
            case 0:
                ((C159377jG) this.A00).BbC();
                break;
            case 1:
                C143516qg r2 = (C143516qg) this.A00;
                r2.A09.A03 = 12;
                r2.A0B();
                return null;
            case 2:
                C143526qh r22 = (C143526qh) this.A00;
                r22.A06.A02 = 10;
                r22.A0A();
                break;
            case 3:
                ((BusinessDirectoryContextualSearchViewModel) this.A00).BTG();
                break;
            case 4:
                ((C143586qn) this.A00).A06.A02.A02();
                return null;
            case 5:
                ((C143586qn) this.A00).A06.A00();
                return null;
            case 6:
                try {
                    ((Context) ((C1503074t) this.A00).A00).startActivity(C36441kJ.A0I("android.settings.WIFI_SETTINGS"));
                    break;
                } catch (ActivityNotFoundException e) {
                    Log.w("No wifi settings", e);
                    break;
                }
            case 7:
                AnonymousClass02E A0N = ((AnonymousClass01I) ((C1503074t) this.A00).A00).getSupportFragmentManager().A0N("media_quality_fragment");
                if ((A0N instanceof MediaQualitySettingsBottomSheetFragment) && (radioButton = ((MediaQualitySettingsBottomSheetFragment) A0N).A01) != null) {
                    radioButton.setChecked(true);
                    break;
                }
            case 8:
                SearchViewModel searchViewModel = (SearchViewModel) this.A00;
                return new AnonymousClass6DB(searchViewModel.A0M.size(), searchViewModel.A0K.size(), searchViewModel.A0O.size(), searchViewModel.A0N.size(), searchViewModel.A07.A02.size(), searchViewModel.A01.size());
            case 9:
                return ((TokenizedSearchInput) this.A00).A0F;
            default:
                AnonymousClass5NK r1 = (AnonymousClass5NK) this.A00;
                AnonymousClass5NK.A04(r1);
                if (!r1.A0M) {
                    r1.A0b.setVisibility(8);
                    break;
                }
                break;
        }
        return AnonymousClass0AJ.A00;
    }
}
