package com.whatsapp.calling.schedulecall;

import X.AnonymousClass11F;
import X.AnonymousClass3UM;
import X.AnonymousClass5VW;
import X.AnonymousClass5WQ;
import X.C012005e;
import X.C1039957w;
import X.C130806Mm;
import X.C133466Yp;
import X.C135456cj;
import X.C163347q3;
import X.C18740tg;
import X.C18820ts;
import X.C19730wQ;
import X.C19970wo;
import X.C20310xM;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C90504aG;
import X.C93154fy;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.KeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import java.text.DateFormat;
import java.util.Calendar;

public class ScheduleCallFragment extends Hilt_ScheduleCallFragment {
    public int A00;
    public TimePickerDialog A01;
    public C19730wQ A02;
    public WaEditText A03;
    public WaEditText A04;
    public WaEditText A05;
    public WaImageView A06;
    public WaTextView A07;
    public C93154fy A08;
    public C130806Mm A09;
    public C19970wo A0A;
    public C18820ts A0B;
    public C20310xM A0C;
    public AnonymousClass11F A0D;
    public String A0E;
    public Calendar A0F;
    public boolean A0G;
    public boolean A0H;
    public final DatePickerDialog.OnDateSetListener A0I = new AnonymousClass5WQ(this, 1);
    public final TimePickerDialog.OnTimeSetListener A0J = new C133466Yp(this);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r4.booleanValue() != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.calling.schedulecall.ScheduleCallFragment A03(X.AnonymousClass11F r3, java.lang.Boolean r4, int r5) {
        /*
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "chatJid"
            r2.putString(r0, r1)
            if (r4 == 0) goto L_0x0016
            boolean r0 = r4.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0017
        L_0x0016:
            r1 = 1
        L_0x0017:
            java.lang.String r0 = "isVideo"
            r2.putBoolean(r0, r1)
            java.lang.String r0 = "entrypoint"
            r2.putInt(r0, r5)
            com.whatsapp.calling.schedulecall.ScheduleCallFragment r0 = new com.whatsapp.calling.schedulecall.ScheduleCallFragment
            r0.<init>()
            r0.A17(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.schedulecall.ScheduleCallFragment.A03(X.11F, java.lang.Boolean, int):com.whatsapp.calling.schedulecall.ScheduleCallFragment");
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        Bundle A0b = A0b();
        this.A0D = C36421kH.A0N(A0b.getString("chatJid"));
        this.A0H = A0b.getBoolean("isVideo");
        this.A00 = A0b.getInt("entrypoint");
        if (this.A0D == null) {
            Log.w("ScheduleCallFragment chatJid is null");
            A1b();
            return;
        }
        A0k().A0l(new AnonymousClass5VW(this, 1), this, "single_selection_dialog_result");
        this.A05 = (WaEditText) C012005e.A02(view, R.id.call_title);
        this.A06 = C36431kI.A0X(view, R.id.call_type_icon);
        this.A07 = C36401kF.A0Q(view, R.id.call_type_text);
        this.A03 = (WaEditText) C012005e.A02(view, R.id.call_date);
        this.A04 = (WaEditText) C012005e.A02(view, R.id.call_time);
        Calendar instance = Calendar.getInstance();
        this.A0F = instance;
        instance.add(11, 1);
        int i = this.A0F.get(12) % 30;
        Calendar calendar = this.A0F;
        int i2 = 30 - i;
        if (i < 15) {
            i2 = -i;
        }
        calendar.add(12, i2);
        String A0q = C36401kF.A0q(this, this.A02.A0A.A02(), new Object[1], 0, R.string.f12nameremoved);
        this.A0E = A0q;
        this.A05.setHint(A0q);
        this.A05.setOnFocusChangeListener(new C163347q3(this, 2));
        C36421kH.A0z(this.A05, this, R.string.f12nameremoved);
        Editable text = this.A05.getText();
        C18740tg.A06(text);
        text.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(32)});
        this.A05.requestFocus();
        ((InputMethodManager) A0a().getSystemService("input_method")).showSoftInput(this.A05, 0);
        C135456cj.A01(this.A03, this, 30);
        this.A03.setKeyListener((KeyListener) null);
        this.A03.setHint(DateFormat.getDateInstance(2, C36401kF.A0x(this.A0B)).format(this.A0F.getTime()));
        C135456cj.A01(this.A04, this, 31);
        this.A04.setKeyListener((KeyListener) null);
        this.A04.setHint(AnonymousClass3UM.A03(this.A0B, this.A0F));
        C135456cj.A01(this.A07, this, 29);
        WaImageView waImageView = this.A06;
        boolean z = this.A0H;
        int i3 = R.drawable.vec_action_voice_call;
        if (z) {
            i3 = R.drawable.vec_action_video_call;
        }
        waImageView.setImageResource(i3);
        WaTextView waTextView = this.A07;
        boolean z2 = this.A0H;
        int i4 = R.string.f12nameremoved;
        if (z2) {
            i4 = R.string.f12nameremoved;
        }
        waTextView.setText(i4);
        C135456cj.A01(C012005e.A02(view, R.id.schedule_call_close_button), this, 27);
        C135456cj.A01(C012005e.A02(view, R.id.create_call_button), this, 28);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        Long l;
        super.onDismiss(dialogInterface);
        int A002 = C36391kE.A00(this.A0H ? 1 : 0);
        if (this.A0G) {
            l = C90504aG.A0h(this.A0F.getTimeInMillis(), System.currentTimeMillis());
        } else {
            l = null;
        }
        boolean z = this.A0G;
        int i = this.A00;
        C1039957w r1 = new C1039957w();
        r1.A00 = Boolean.valueOf(z);
        r1.A01 = Integer.valueOf(A002);
        r1.A02 = Integer.valueOf(i);
        r1.A03 = l;
        this.A09.A00.Bly(r1);
    }
}
