package com.whatsapp.settings.chat.wallpaper;

import X.C36391kE;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog$Builder;
import com.whatsapp.R;

public class WallpaperSetConfirmationDialogFragment extends Hilt_WallpaperSetConfirmationDialogFragment {
    public AlertDialog$Builder A1k() {
        AlertDialog$Builder A1k = super.A1k();
        TextView textView = (TextView) LayoutInflater.from(A0h()).inflate(R.layout.f9nameremoved, (ViewGroup) null);
        textView.setText(R.string.f12nameremoved);
        A1k.setView(textView);
        View inflate = LayoutInflater.from(A0h()).inflate(R.layout.f9nameremoved, (ViewGroup) null);
        C36391kE.A0O(inflate, R.id.wallpaper_confirmation_title_view).setText(R.string.f12nameremoved);
        A1k.A0Y(inflate);
        return A1k;
    }
}
