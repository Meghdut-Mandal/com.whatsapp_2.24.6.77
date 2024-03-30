package X;

import androidx.car.app.model.InputCallbackDelegateImpl;
import androidx.car.app.model.SearchCallbackDelegateImpl;
import androidx.car.app.model.TabCallbackDelegateImpl;

public class B9Q implements AnonymousClass7dU {
    public Object A00;
    public String A01;
    public final int A02;

    public B9Q(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public final Object B5f() {
        int i = this.A02;
        Object obj = this.A00;
        switch (i) {
            case 0:
                ((InputCallbackDelegateImpl.OnInputCallbackStub) obj).m29lambda$onInputSubmitted$0$androidxcarappmodelInputCallbackDelegateImpl$OnInputCallbackStub(this.A01);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            case 1:
                ((InputCallbackDelegateImpl.OnInputCallbackStub) obj).m30lambda$onInputTextChanged$1$androidxcarappmodelInputCallbackDelegateImpl$OnInputCallbackStub(this.A01);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            case 2:
                ((SearchCallbackDelegateImpl.SearchCallbackStub) obj).m36lambda$onSearchSubmitted$1$androidxcarappmodelSearchCallbackDelegateImpl$SearchCallbackStub(this.A01);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            case 3:
                ((SearchCallbackDelegateImpl.SearchCallbackStub) obj).m37lambda$onSearchTextChanged$0$androidxcarappmodelSearchCallbackDelegateImpl$SearchCallbackStub(this.A01);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            default:
                ((TabCallbackDelegateImpl.TabCallbackStub) obj).m38lambda$onTabSelected$0$androidxcarappmodelTabCallbackDelegateImpl$TabCallbackStub(this.A01);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }
}
