package com.tencent.mm.protocal.b;

import a.a.a.b;
import java.util.LinkedList;

public final class adj
  extends com.tencent.mm.at.a
{
  public int dzC;
  public int fpL;
  public String fsI;
  public aly iXt;
  public String iXy;
  public int jAm;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (a.a.a.c.a)paramVarArgs[0];
      if (iXt == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (iXt != null)
      {
        paramVarArgs.cj(1, iXt.kn());
        iXt.a(paramVarArgs);
      }
      if (fsI != null) {
        paramVarArgs.d(2, fsI);
      }
      paramVarArgs.ci(3, dzC);
      paramVarArgs.ci(4, fpL);
      paramVarArgs.ci(5, jAm);
      if (iXy != null) {
        paramVarArgs.d(6, iXy);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (iXt == null) {
        break label532;
      }
    }
    label532:
    for (paramInt = a.a.a.a.ch(1, iXt.kn()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (fsI != null) {
        i = paramInt + a.a.a.b.b.a.e(2, fsI);
      }
      i = i + a.a.a.a.cg(3, dzC) + a.a.a.a.cg(4, fpL) + a.a.a.a.cg(5, jAm);
      paramInt = i;
      if (iXy != null) {
        paramInt = i + a.a.a.b.b.a.e(6, iXy);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new a.a.a.a.a((byte[])paramVarArgs[0], iTR);
        for (paramInt = com.tencent.mm.at.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.at.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.bog();
          }
        }
        if (iXt != null) {
          break;
        }
        throw new b("Not all required fields were included: ToUserName");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (a.a.a.a.a)paramVarArgs[0];
        adj localadj = (adj)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((a.a.a.a.a)localObject1).sJ(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new aly();
            localObject2 = new a.a.a.a.a((byte[])localObject2, iTR);
            for (boolean bool = true; bool; bool = ((aly)localObject1).a((a.a.a.a.a)localObject2, (com.tencent.mm.at.a)localObject1, com.tencent.mm.at.a.a((a.a.a.a.a)localObject2))) {}
            iXt = ((aly)localObject1);
            paramInt += 1;
          }
        case 2: 
          fsI = maU.readString();
          return 0;
        case 3: 
          dzC = maU.jC();
          return 0;
        case 4: 
          fpL = maU.jC();
          return 0;
        case 5: 
          jAm = maU.jC();
          return 0;
        }
        iXy = maU.readString();
        return 0;
      }
      return -1;
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.protocal.b.adj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */