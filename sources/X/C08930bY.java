package X;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.0bY  reason: invalid class name and case insensitive filesystem */
public class C08930bY implements Transition.TransitionListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C03660Hf A01;
    public final /* synthetic */ ArrayList A02;

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public C08930bY(View view, C03660Hf r2, ArrayList arrayList) {
        this.A01 = r2;
        this.A00 = view;
        this.A02 = arrayList;
    }

    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.A00.setVisibility(8);
        ArrayList arrayList = this.A02;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass000.A0Z(arrayList, i).setVisibility(0);
        }
    }

    public void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
