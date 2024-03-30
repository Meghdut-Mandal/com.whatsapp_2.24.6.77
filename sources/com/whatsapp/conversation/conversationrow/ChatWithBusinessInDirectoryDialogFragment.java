package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass001;
import X.AnonymousClass1T7;
import X.AnonymousClass3LW;
import X.AnonymousClass3T1;
import X.C012005e;
import X.C19460v5;
import X.C20380xT;
import X.C24801Dv;
import X.C36391kE;
import X.C36421kH;
import X.C39001qm;
import X.C603437m;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import java.util.Random;

public class ChatWithBusinessInDirectoryDialogFragment extends Hilt_ChatWithBusinessInDirectoryDialogFragment implements View.OnClickListener {
    public C19460v5 A00;
    public C24801Dv A01;
    public C603437m A02;
    public AnonymousClass1T7 A03;
    public C20380xT A04;
    public boolean A05;

    public static ChatWithBusinessInDirectoryDialogFragment A03(boolean z) {
        ChatWithBusinessInDirectoryDialogFragment chatWithBusinessInDirectoryDialogFragment = new ChatWithBusinessInDirectoryDialogFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putBoolean("arg_conversation_stared_by_me", z);
        chatWithBusinessInDirectoryDialogFragment.A17(A07);
        return chatWithBusinessInDirectoryDialogFragment;
    }

    public Dialog A1a(Bundle bundle) {
        this.A05 = A0b().getBoolean("arg_conversation_stared_by_me");
        View A0D = C36421kH.A0D(A0a(), R.layout.f9nameremoved);
        boolean z = this.A05;
        int i = R.string.f12nameremoved;
        if (z) {
            i = R.string.f12nameremoved;
        }
        C36391kE.A0O(A0D, R.id.message).setText(i);
        View A022 = C012005e.A02(A0D, R.id.title);
        if (this.A05) {
            A022.setVisibility(8);
        }
        View A023 = C012005e.A02(A0D, R.id.btn_negative_vertical);
        View A024 = C012005e.A02(A0D, R.id.btn_negative_horizontal);
        View A025 = C012005e.A02(A0D, R.id.btn_positive);
        if (this.A05) {
            A023.setVisibility(8);
        } else {
            A024.setVisibility(4);
        }
        A025.setOnClickListener(this);
        A024.setOnClickListener(this);
        A023.setOnClickListener(this);
        C39001qm A042 = AnonymousClass3LW.A04(this);
        A042.A0j(A0D);
        A042.A0r(true);
        return A042.create();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_negative_horizontal) {
            this.A01.Bp7(A0a(), this.A04.A04("security-and-privacy", "how-to-select-a-location-when-looking-for-businesses-nearby"), (AnonymousClass3T1) null);
        } else if (id == R.id.btn_negative_vertical) {
            C603437m r1 = this.A02;
            r1.A00 = 9;
            Random random = r1.A01;
            if (random == null) {
                random = new Random();
                r1.A01 = random;
            }
            random.nextLong();
            A0a();
            this.A00.A02();
            A0a();
            throw AnonymousClass001.A0A("businessDirectoryStatusActivity");
        }
        A1b();
    }
}
