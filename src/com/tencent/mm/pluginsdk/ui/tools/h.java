package com.tencent.mm.pluginsdk.ui.tools;

import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import com.tencent.mm.ui.widget.MMEditText.b;

public final class h
{
  public static InputFilter[] iSL = { new InputFilter.LengthFilter(50) };
  
  public static final class a
    implements TextWatcher
  {
    public MMEditText.b iSM = null;
    
    public final void afterTextChanged(Editable paramEditable) {}
    
    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
    
    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      if (iSM != null) {
        iSM.aqD();
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */