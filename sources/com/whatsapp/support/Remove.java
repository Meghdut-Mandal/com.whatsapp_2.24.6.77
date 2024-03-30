package com.whatsapp.support;

import X.AnonymousClass01I;
import X.AnonymousClass04G;
import X.C18700tb;
import X.C27011Mj;
import X.C28721Tt;
import X.C36331k8;
import X.C36431kI;
import X.C36441kJ;
import X.C89374Wh;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;

public class Remove extends AnonymousClass01I implements C18700tb {
    public boolean A00;
    public final Object A01;
    public volatile C27011Mj A02;

    public final Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new C27011Mj(this);
                }
            }
        }
        return this.A02.generatedComponent();
    }

    public Remove(int i) {
        this.A01 = C36441kJ.A11();
        this.A00 = false;
        C89374Wh.A00(this, 8);
    }

    public AnonymousClass04G BAw() {
        return C28721Tt.A00(this, super.BAw());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        Intent A0D = C36431kI.A0D();
        A0D.putExtra("is_removed", true);
        C36331k8.A0o(this, A0D);
    }

    public Remove() {
        this(0);
    }
}
