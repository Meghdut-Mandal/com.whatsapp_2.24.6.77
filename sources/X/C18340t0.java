package X;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: X.0t0  reason: invalid class name and case insensitive filesystem */
public class C18340t0 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C18340t0(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onClick(View view) {
        Message message;
        Message obtain;
        String str;
        String str2;
        String str3;
        String str4;
        switch (this.A01) {
            case 0:
                AnonymousClass0YZ r3 = (AnonymousClass0YZ) this.A00;
                if (((view == r3.A0H && (message = r3.A0C) != null) || ((view == r3.A0F && (message = r3.A0A) != null) || (view == r3.A0G && (message = r3.A0B) != null))) && (obtain = Message.obtain(message)) != null) {
                    obtain.sendToTarget();
                }
                r3.A09.obtainMessage(1, r3.A0X).sendToTarget();
                return;
            case 1:
                SearchView searchView = (SearchView) this.A00;
                if (view == searchView.A0b) {
                    searchView.A0E();
                    return;
                } else if (view == searchView.A0Z) {
                    searchView.A0D();
                    return;
                } else if (view == searchView.A0a) {
                    searchView.A0F();
                    return;
                } else if (view == searchView.A0c) {
                    SearchableInfo searchableInfo = searchView.A01;
                    if (searchableInfo != null) {
                        try {
                            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                                Intent intent = new Intent(searchView.A0V);
                                ComponentName searchActivity = searchableInfo.getSearchActivity();
                                if (searchActivity == null) {
                                    str4 = null;
                                } else {
                                    str4 = searchActivity.flattenToShortString();
                                }
                                intent.putExtra("calling_package", str4);
                                searchView.getContext().startActivity(intent);
                                return;
                            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                                Intent intent2 = searchView.A0U;
                                ComponentName searchActivity2 = searchableInfo.getSearchActivity();
                                Intent intent3 = new Intent("android.intent.action.SEARCH");
                                intent3.setComponent(searchActivity2);
                                PendingIntent activity = PendingIntent.getActivity(searchView.getContext(), 0, intent3, 1073741824);
                                Bundle A07 = AnonymousClass001.A07();
                                Bundle bundle = searchView.A02;
                                if (bundle != null) {
                                    A07.putParcelable("app_data", bundle);
                                }
                                Intent intent4 = new Intent(intent2);
                                int i = 1;
                                Resources resources = searchView.getResources();
                                if (searchableInfo.getVoiceLanguageModeId() != 0) {
                                    str = resources.getString(searchableInfo.getVoiceLanguageModeId());
                                } else {
                                    str = "free_form";
                                }
                                String str5 = null;
                                if (searchableInfo.getVoicePromptTextId() != 0) {
                                    str2 = resources.getString(searchableInfo.getVoicePromptTextId());
                                } else {
                                    str2 = null;
                                }
                                if (searchableInfo.getVoiceLanguageId() != 0) {
                                    str3 = resources.getString(searchableInfo.getVoiceLanguageId());
                                } else {
                                    str3 = null;
                                }
                                if (searchableInfo.getVoiceMaxResults() != 0) {
                                    i = searchableInfo.getVoiceMaxResults();
                                }
                                intent4.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
                                intent4.putExtra("android.speech.extra.PROMPT", str2);
                                intent4.putExtra("android.speech.extra.LANGUAGE", str3);
                                intent4.putExtra("android.speech.extra.MAX_RESULTS", i);
                                if (searchActivity2 != null) {
                                    str5 = searchActivity2.flattenToShortString();
                                }
                                intent4.putExtra("calling_package", str5);
                                intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                                intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", A07);
                                searchView.getContext().startActivity(intent4);
                                return;
                            } else {
                                return;
                            }
                        } catch (ActivityNotFoundException unused) {
                            Log.w("SearchView", "Could not find voice search activity");
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (view == searchView.A0d) {
                    searchView.A0C();
                    return;
                } else {
                    return;
                }
            case 2:
                AnonymousClass0FL r5 = (AnonymousClass0FL) this.A00;
                if (r5.A03 && r5.isShowing()) {
                    if (!r5.A05) {
                        TypedArray obtainStyledAttributes = r5.getContext().obtainStyledAttributes(new int[]{16843611});
                        r5.A04 = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        r5.A05 = true;
                    }
                    if (r5.A04) {
                        r5.cancel();
                        return;
                    }
                    return;
                }
                return;
            default:
                MaterialCalendar materialCalendar = (MaterialCalendar) this.A00;
                Integer num = materialCalendar.A08;
                Integer num2 = C023109s.A01;
                Integer num3 = C023109s.A00;
                if (num == num2) {
                    materialCalendar.A08 = num3;
                    AnonymousClass02E.A04(materialCalendar, 8, 0);
                    materialCalendar.A1Y(materialCalendar.A07);
                    return;
                } else if (num == num3) {
                    materialCalendar.A08 = num2;
                    RecyclerView recyclerView = materialCalendar.A05;
                    recyclerView.getLayoutManager().A17(materialCalendar.A07.A04 - ((AnonymousClass0Hx) recyclerView.A0G).A00.A06.A05.A04);
                    AnonymousClass02E.A04(materialCalendar, 0, 8);
                    return;
                } else {
                    return;
                }
        }
    }
}
