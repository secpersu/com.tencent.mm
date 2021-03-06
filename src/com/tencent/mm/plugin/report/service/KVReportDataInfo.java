package com.tencent.mm.plugin.report.service;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class KVReportDataInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {};
  public boolean fUh;
  public long fUv;
  public boolean fUw;
  public String value;
  
  public KVReportDataInfo() {}
  
  protected KVReportDataInfo(Parcel paramParcel)
  {
    fUv = paramParcel.readLong();
    value = paramParcel.readString();
    if (paramParcel.readInt() == 1)
    {
      bool1 = true;
      fUw = bool1;
      if (paramParcel.readInt() != 1) {
        break label58;
      }
    }
    label58:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      fUh = bool1;
      return;
      bool1 = false;
      break;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeLong(fUv);
    paramParcel.writeString(value);
    if (fUw)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!fUh) {
        break label52;
      }
    }
    label52:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      return;
      paramInt = 0;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.plugin.report.service.KVReportDataInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */