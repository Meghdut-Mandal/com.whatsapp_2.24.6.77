package com.whatsapp.events;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass04H;
import X.AnonymousClass05K;
import X.AnonymousClass0A2;
import X.AnonymousClass11F;
import X.AnonymousClass17Y;
import X.AnonymousClass1DW;
import X.AnonymousClass1H2;
import X.AnonymousClass1N0;
import X.AnonymousClass1N2;
import X.AnonymousClass1RJ;
import X.AnonymousClass2XH;
import X.AnonymousClass2bT;
import X.AnonymousClass3Q2;
import X.AnonymousClass3QB;
import X.AnonymousClass3RF;
import X.AnonymousClass3Y0;
import X.AnonymousClass3Y1;
import X.AnonymousClass4BN;
import X.AnonymousClass4I8;
import X.AnonymousClass4XY;
import X.AnonymousClass4ZC;
import X.AnonymousClass6YV;
import X.C000800j;
import X.C001400p;
import X.C005502l;
import X.C008903u;
import X.C009504a;
import X.C009904e;
import X.C012005e;
import X.C023109s;
import X.C023509x;
import X.C18820ts;
import X.C19890wg;
import X.C19970wo;
import X.C20810yC;
import X.C21060yb;
import X.C220412q;
import X.C29541Xa;
import X.C29581Xe;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C39321ri;
import X.C40071us;
import X.C47902fz;
import X.C48742hy;
import X.C51852oU;
import X.C54222sb;
import X.C54952tp;
import X.C55472ug;
import X.C58222zW;
import X.C61763Di;
import X.C65073Qp;
import X.C65673Ta;
import X.C84994Fj;
import X.C85474Hf;
import X.C93154fy;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.KeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.location.PlaceInfo;
import com.whatsapp.wds.components.fab.WDSFab;
import com.whatsapp.wds.components.toggle.WDSSwitch;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public final class EventCreateOrEditFragment extends Hilt_EventCreateOrEditFragment {
    public LinearLayout A00;
    public C58222zW A01;
    public AnonymousClass17Y A02;
    public WaEditText A03;
    public WaEditText A04;
    public WaEditText A05;
    public WaEditText A06;
    public WaImageView A07;
    public WaTextView A08;
    public WaTextView A09;
    public C21060yb A0A;
    public C18820ts A0B;
    public C220412q A0C;
    public AnonymousClass1DW A0D;
    public AnonymousClass1N0 A0E;
    public AnonymousClass1H2 A0F;
    public C29541Xa A0G;
    public C40071us A0H;
    public C61763Di A0I;
    public C29581Xe A0J;
    public C20810yC A0K;
    public AnonymousClass2XH A0L;
    public C19890wg A0M;
    public AnonymousClass1N2 A0N;
    public AnonymousClass1RJ A0O;
    public AnonymousClass1RJ A0P;
    public AnonymousClass1RJ A0Q;
    public AnonymousClass1RJ A0R;
    public AnonymousClass1RJ A0S;
    public WDSFab A0T;
    public WDSSwitch A0U;
    public C005502l A0V;
    public final C009904e A0W;
    public final AnonymousClass00T A0X;
    public final AnonymousClass00T A0Y = C36431kI.A1I(AnonymousClass4I8.A00);
    public final AnonymousClass00T A0Z;
    public final AnonymousClass00T A0a;
    public final DatePickerDialog.OnDateSetListener A0b;
    public final TimePickerDialog.OnTimeSetListener A0c;

    public void A1A(Bundle bundle) {
        this.A0Y = true;
        if (bundle != null) {
            long j = bundle.getLong("STATE_EVENT_START_TIME");
            if (Long.valueOf(j) != null) {
                ((Calendar) C36381kD.A0p(this.A0Y)).setTimeInMillis(j);
                A05(this);
                A03(this);
            }
        }
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
    }

    public void A1R(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        bundle.putLong("STATE_EVENT_START_TIME", ((Calendar) C36381kD.A0p(this.A0Y)).getTimeInMillis());
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass1RJ r1;
        View A012;
        View A013;
        View view2 = view;
        AnonymousClass00C.A0D(view2, 0);
        this.A03 = (WaEditText) C012005e.A02(view2, R.id.event_date);
        this.A05 = (WaEditText) C012005e.A02(view2, R.id.event_time);
        this.A0U = (WDSSwitch) C012005e.A02(view2, R.id.event_call_switch);
        this.A07 = C36431kI.A0X(view2, R.id.event_call_icon);
        this.A09 = C36401kF.A0Q(view2, R.id.event_call_text);
        this.A0S = C36341k9.A0X(view2, R.id.event_call_spinner);
        this.A00 = (LinearLayout) C012005e.A02(view2, R.id.event_location_row);
        this.A08 = C36401kF.A0Q(view2, R.id.event_location_text);
        this.A0Q = C36341k9.A0X(view2, R.id.event_location_description);
        this.A0R = C36341k9.A0X(view2, R.id.event_location_remove);
        this.A06 = (WaEditText) C012005e.A02(view2, R.id.event_title);
        this.A04 = (WaEditText) C012005e.A02(view2, R.id.event_description);
        this.A0T = (WDSFab) C012005e.A02(view2, R.id.event_create_or_edit_button);
        this.A0P = C36341k9.A0X(view2, R.id.event_edit_section);
        this.A0O = C36341k9.A0X(view2, R.id.event_call_type);
        C58222zW r11 = this.A01;
        if (r11 != null) {
            Object value = this.A0X.getValue();
            long A082 = C36351kA.A08(this.A0a);
            AnonymousClass00T r12 = this.A0Z;
            Object value2 = r12.getValue();
            AnonymousClass00C.A0D(value, 1);
            this.A0H = (C40071us) new AnonymousClass04H(new AnonymousClass4ZC(r11, value, value2, 0, A082), this).A00(C40071us.class);
            LifecycleCoroutineScopeImpl A0T2 = C36411kG.A0T(this);
            EventCreateOrEditFragment$onViewCreated$1 eventCreateOrEditFragment$onViewCreated$1 = new EventCreateOrEditFragment$onViewCreated$1(this, (C023509x) null);
            C008903u r5 = C008903u.A00;
            Integer num = C023109s.A00;
            AnonymousClass0A2.A02(num, r5, eventCreateOrEditFragment$onViewCreated$1, A0T2);
            AnonymousClass0A2.A02(num, r5, new EventCreateOrEditFragment$onViewCreated$2(bundle, this, (C023509x) null), C36411kG.A0T(this));
            AnonymousClass0A2.A02(num, r5, new EventCreateOrEditFragment$onViewCreated$3(this, (C023509x) null), C36411kG.A0T(this));
            AnonymousClass0A2.A02(num, r5, new EventCreateOrEditFragment$onViewCreated$4(this, (C023509x) null), C36411kG.A0T(this));
            WaEditText waEditText = this.A06;
            if (waEditText != null) {
                waEditText.requestFocus();
            }
            AnonymousClass1N2 r3 = this.A0N;
            if (r3 != null) {
                WaEditText waEditText2 = this.A06;
                if (waEditText2 != null) {
                    r3.A02(waEditText2);
                    WaEditText waEditText3 = this.A06;
                    if (waEditText3 != null) {
                        waEditText3.addTextChangedListener(new C39321ri(this, 1));
                    }
                    WaEditText waEditText4 = this.A06;
                    if (waEditText4 != null) {
                        InputFilter.LengthFilter[] lengthFilterArr = new InputFilter.LengthFilter[1];
                        C20810yC r32 = this.A0K;
                        if (r32 != null) {
                            lengthFilterArr[0] = new InputFilter.LengthFilter(r32.A07(6207));
                            waEditText4.setFilters(lengthFilterArr);
                        } else {
                            throw C36321k7.A07();
                        }
                    }
                    WaEditText waEditText5 = this.A04;
                    if (waEditText5 != null) {
                        InputFilter.LengthFilter[] lengthFilterArr2 = new InputFilter.LengthFilter[1];
                        C20810yC r2 = this.A0K;
                        if (r2 != null) {
                            lengthFilterArr2[0] = new InputFilter.LengthFilter(r2.A07(6208));
                            waEditText5.setFilters(lengthFilterArr2);
                            AnonymousClass1H2 r112 = this.A0F;
                            if (r112 != null) {
                                C21060yb r8 = this.A0A;
                                if (r8 != null) {
                                    C18820ts r9 = this.A0B;
                                    if (r9 != null) {
                                        C19890wg r122 = this.A0M;
                                        if (r122 != null) {
                                            AnonymousClass1N0 r10 = this.A0E;
                                            if (r10 != null) {
                                                C20810yC r22 = this.A0K;
                                                if (r22 != null) {
                                                    waEditText5.addTextChangedListener(new C47902fz(waEditText5, (TextView) null, r8, r9, r10, r112, r122, r22.A07(6208), 0, true));
                                                } else {
                                                    throw C36321k7.A07();
                                                }
                                            } else {
                                                throw C36331k8.A0d("emojiRichFormatterStaticCaller");
                                            }
                                        } else {
                                            throw C36331k8.A0d("sharedPreferencesFactory");
                                        }
                                    } else {
                                        throw C36321k7.A09();
                                    }
                                } else {
                                    throw C36331k8.A0W();
                                }
                            } else {
                                throw C36331k8.A0d("emojiLoader");
                            }
                        } else {
                            throw C36321k7.A07();
                        }
                    }
                }
                A05(this);
                A03(this);
                LinearLayout linearLayout = this.A00;
                if (linearLayout != null) {
                    AnonymousClass3Y1.A00(linearLayout, this, 0);
                }
                AnonymousClass1RJ r4 = this.A0R;
                if (r4 != null) {
                    r4.A05(new AnonymousClass3Y0(this, 48));
                }
                AnonymousClass1RJ r23 = this.A0R;
                if (!(r23 == null || (A013 = r23.A01()) == null)) {
                    C36421kH.A0z(A013, this, R.string.f12nameremoved);
                }
                WDSSwitch wDSSwitch = this.A0U;
                if (wDSSwitch != null) {
                    AnonymousClass4XY.A00(wDSSwitch, this, 8);
                }
                A0k().A0l(new AnonymousClass3RF(this, 5), A0i(), "single_selection_dialog_result");
                WDSFab wDSFab = this.A0T;
                if (wDSFab != null) {
                    C18820ts r42 = this.A0B;
                    if (r42 != null) {
                        C36321k7.A0L(A0a(), wDSFab, r42, R.drawable.input_send);
                    } else {
                        throw C36321k7.A09();
                    }
                }
                WDSFab wDSFab2 = this.A0T;
                if (wDSFab2 != null) {
                    C48742hy.A01(wDSFab2, this, 35);
                }
                if (r12.getValue() != null && (r1 = this.A0P) != null && (A012 = r1.A01()) != null) {
                    AnonymousClass1RJ r13 = this.A0P;
                    if (r13 != null) {
                        r13.A03(0);
                    }
                    C48742hy.A01(C36361kB.A0G(A012, R.id.event_cancel_row), this, 36);
                    return;
                }
                return;
            }
            throw C36331k8.A0d("imeUtils");
        }
        throw C36331k8.A0d("eventCreateOrEditViewModelFactory");
    }

    public static final void A00(EventCreateOrEditFragment eventCreateOrEditFragment) {
        if (eventCreateOrEditFragment.A0Z.getValue() != null) {
            AnonymousClass17Y r2 = eventCreateOrEditFragment.A02;
            if (r2 != null) {
                r2.A06(R.string.f12nameremoved, 0);
            } else {
                throw C36321k7.A06();
            }
        }
        Bundle A072 = AnonymousClass001.A07();
        A072.putBoolean("SUCCESS", true);
        eventCreateOrEditFragment.A0l().A0o("RESULT", A072);
        C61763Di r1 = eventCreateOrEditFragment.A0I;
        if (r1 != null) {
            r1.A00(eventCreateOrEditFragment.A0i());
            return;
        }
        throw C36331k8.A0d("eventRequestExactAlarmPermissionUtil");
    }

    public void A1J() {
        WaEditText waEditText = this.A05;
        if (waEditText != null) {
            waEditText.setOnClickListener((View.OnClickListener) null);
        }
        WaEditText waEditText2 = this.A05;
        if (waEditText2 != null) {
            waEditText2.setOnClickListener((View.OnClickListener) null);
        }
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            linearLayout.setOnClickListener((View.OnClickListener) null);
        }
        WDSSwitch wDSSwitch = this.A0U;
        if (wDSSwitch != null) {
            wDSSwitch.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        this.A03 = null;
        this.A04 = null;
        this.A05 = null;
        this.A06 = null;
        this.A07 = null;
        this.A09 = null;
        this.A0S = null;
        this.A0Q = null;
        this.A0R = null;
        this.A08 = null;
        this.A00 = null;
        this.A0T = null;
        this.A0P = null;
        this.A0O = null;
        this.A0U = null;
        super.A1J();
    }

    public final boolean A1Z() {
        Editable editable;
        String str;
        Double d;
        Double d2;
        String str2;
        C40071us r3 = this.A0H;
        Editable editable2 = null;
        if (r3 == null) {
            throw C36331k8.A0d("eventCreateOrEditViewModel");
        }
        WaEditText waEditText = this.A06;
        if (waEditText != null) {
            editable = waEditText.getText();
        } else {
            editable = null;
        }
        String valueOf = String.valueOf(editable);
        long time = ((Calendar) C36381kD.A0p(this.A0Y)).getTime().getTime();
        WaEditText waEditText2 = this.A04;
        if (waEditText2 != null) {
            editable2 = waEditText2.getText();
        }
        String valueOf2 = String.valueOf(editable2);
        AnonymousClass2bT A012 = C40071us.A01(r3);
        if (A012 == null) {
            return false;
        }
        String A0B2 = AnonymousClass6YV.A0B(valueOf, false);
        AnonymousClass00C.A08(A0B2);
        String A0B3 = AnonymousClass6YV.A0B(valueOf2, false);
        AnonymousClass00C.A08(A0B3);
        AnonymousClass05K r4 = r3.A0F;
        if (((AnonymousClass3Q2) r4.getValue()).A00.ordinal() == 2) {
            str = ((AnonymousClass3Q2) r4.getValue()).A02;
        } else {
            str = null;
        }
        long j = A012.A0I;
        C29541Xa r42 = r3.A07;
        AnonymousClass11F r5 = r3.A09;
        AnonymousClass05K r32 = r3.A0G;
        PlaceInfo A002 = AnonymousClass3QB.A00(r32);
        String str3 = null;
        if (A002 != null) {
            d = Double.valueOf(A002.A01);
        } else {
            d = null;
        }
        PlaceInfo A003 = AnonymousClass3QB.A00(r32);
        if (A003 != null) {
            d2 = Double.valueOf(A003.A02);
        } else {
            d2 = null;
        }
        PlaceInfo A004 = AnonymousClass3QB.A00(r32);
        if (A004 != null) {
            str2 = A004.A06;
        } else {
            str2 = null;
        }
        PlaceInfo A005 = AnonymousClass3QB.A00(r32);
        if (A005 != null) {
            str3 = A005.A04;
        }
        return A012.equals(C54222sb.A00(r42, r5, d, d2, A0B3, str, str3, str2, A0B2, time, j, false));
    }

    public EventCreateOrEditFragment() {
        C000800j r2 = C000800j.NONE;
        this.A0X = C001400p.A00(r2, new C84994Fj(this));
        this.A0a = C001400p.A00(r2, new C85474Hf(this, "extra_quoted_message_row_id"));
        this.A0Z = C36431kI.A1I(new AnonymousClass4BN(this));
        this.A0b = new C55472ug(this, 1);
        this.A0c = new C54952tp(this, 1);
        this.A0W = BnD(new C65673Ta(this, 3), new C009504a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r1 == 3) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.whatsapp.events.EventCreateOrEditFragment r10) {
        /*
            android.content.Context r5 = r10.A0a()
            android.app.TimePickerDialog$OnTimeSetListener r6 = r10.A0c
            X.00T r3 = r10.A0Y
            java.lang.Object r1 = X.C36381kD.A0p(r3)
            java.util.Calendar r1 = (java.util.Calendar) r1
            r0 = 11
            int r7 = r1.get(r0)
            java.lang.Object r1 = X.C36381kD.A0p(r3)
            java.util.Calendar r1 = (java.util.Calendar) r1
            r0 = 12
            int r8 = r1.get(r0)
            X.0ts r0 = r10.A0B
            if (r0 == 0) goto L_0x007d
            X.1Kv r0 = X.C18820ts.A00(r0)
            boolean r0 = r0.A00
            r2 = 0
            if (r0 != 0) goto L_0x003f
            X.0ts r0 = r10.A0B
            if (r0 == 0) goto L_0x0078
            java.util.Locale r0 = X.C36401kF.A0x(r0)
            int r1 = X.C26621Kw.A00(r0)
            if (r1 == 0) goto L_0x003f
            r0 = 3
            r9 = 0
            if (r1 != r0) goto L_0x0040
        L_0x003f:
            r9 = 1
        L_0x0040:
            android.app.TimePickerDialog r4 = new android.app.TimePickerDialog
            r4.<init>(r5, r6, r7, r8, r9)
            com.whatsapp.WaEditText r0 = r10.A05
            if (r0 == 0) goto L_0x004c
            r0.setFocusable(r2)
        L_0x004c:
            com.whatsapp.WaEditText r1 = r10.A05
            if (r1 == 0) goto L_0x0055
            r0 = 46
            X.AnonymousClass3Y0.A01(r1, r4, r0)
        L_0x0055:
            com.whatsapp.WaEditText r1 = r10.A05
            if (r1 == 0) goto L_0x005d
            r0 = 0
            r1.setKeyListener(r0)
        L_0x005d:
            com.whatsapp.WaEditText r2 = r10.A05
            if (r2 == 0) goto L_0x0072
            X.0ts r1 = r10.A0B
            if (r1 == 0) goto L_0x0073
            java.lang.Object r0 = X.C36381kD.A0p(r3)
            java.util.Calendar r0 = (java.util.Calendar) r0
            java.lang.String r0 = X.AnonymousClass3UM.A03(r1, r0)
            r2.setText(r0)
        L_0x0072:
            return
        L_0x0073:
            java.lang.RuntimeException r0 = X.C36321k7.A09()
            throw r0
        L_0x0078:
            java.lang.RuntimeException r0 = X.C36321k7.A09()
            throw r0
        L_0x007d:
            java.lang.RuntimeException r0 = X.C36321k7.A09()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.events.EventCreateOrEditFragment.A03(com.whatsapp.events.EventCreateOrEditFragment):void");
    }

    public static final void A05(EventCreateOrEditFragment eventCreateOrEditFragment) {
        Calendar instance = Calendar.getInstance();
        AnonymousClass00C.A08(instance);
        EventCreateOrEditFragment eventCreateOrEditFragment2 = eventCreateOrEditFragment;
        Context A0a2 = eventCreateOrEditFragment2.A0a();
        DatePickerDialog.OnDateSetListener onDateSetListener = eventCreateOrEditFragment2.A0b;
        AnonymousClass00T r9 = eventCreateOrEditFragment2.A0Y;
        C93154fy r11 = new C93154fy(onDateSetListener, A0a2, (Calendar) null, 0, ((Calendar) C36381kD.A0p(r9)).get(1), ((Calendar) C36381kD.A0p(r9)).get(2), ((Calendar) C36381kD.A0p(r9)).get(5));
        DatePicker datePicker = r11.A01;
        datePicker.setMinDate(instance.getTimeInMillis());
        C220412q r1 = eventCreateOrEditFragment2.A0C;
        if (r1 != null) {
            C65073Qp A092 = r1.A09(C36421kH.A0O(eventCreateOrEditFragment2.A0X), false);
            long j = Long.MAX_VALUE;
            if (A092 != null && A092.A0b.expiration > 0) {
                j = instance.getTimeInMillis() + TimeUnit.SECONDS.toMillis((long) A092.A0b.expiration);
            }
            C40071us r0 = eventCreateOrEditFragment2.A0H;
            if (r0 == null) {
                throw C36331k8.A0d("eventCreateOrEditViewModel");
            }
            if (((AnonymousClass3Q2) r0.A0F.getValue()).A00 == C51852oU.SUCCESS) {
                C29581Xe r5 = eventCreateOrEditFragment2.A0J;
                if (r5 != null) {
                    j = Math.min(C19970wo.A00(r5.A01) + TimeUnit.DAYS.toMillis(C36441kJ.A0B(r5.A02, 6265)), j);
                } else {
                    throw C36331k8.A0d("eventUtils");
                }
            }
            datePicker.setMaxDate(j);
            WaEditText waEditText = eventCreateOrEditFragment2.A03;
            if (waEditText != null) {
                waEditText.setFocusable(false);
            }
            WaEditText waEditText2 = eventCreateOrEditFragment2.A03;
            if (waEditText2 != null) {
                AnonymousClass3Y0.A01(waEditText2, r11, 47);
            }
            WaEditText waEditText3 = eventCreateOrEditFragment2.A03;
            if (waEditText3 != null) {
                waEditText3.setKeyListener((KeyListener) null);
            }
            WaEditText waEditText4 = eventCreateOrEditFragment2.A03;
            if (waEditText4 != null) {
                C18820ts r02 = eventCreateOrEditFragment2.A0B;
                if (r02 != null) {
                    waEditText4.setText(DateFormat.getDateInstance(2, C36401kF.A0x(r02)).format(((Calendar) C36381kD.A0p(r9)).getTime()));
                    return;
                }
                throw C36321k7.A09();
            }
            return;
        }
        throw C36331k8.A0d("chatsCache");
    }
}
