package com.tencent.mm.protocal.b;

import a.a.a.b;
import java.util.LinkedList;

public final class ir
  extends adm
{
  public int hiN;
  public long hiW;
  public int hjV;
  public int hjW;
  public adt hlA;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (a.a.a.c.a)paramVarArgs[0];
      if (hLQ == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (hlA == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (hLQ != null)
      {
        paramVarArgs.bN(1, hLQ.kS());
        hLQ.a(paramVarArgs);
      }
      paramVarArgs.bM(2, hiN);
      paramVarArgs.bM(3, hjV);
      paramVarArgs.bM(4, hjW);
      if (hlA != null)
      {
        paramVarArgs.bN(5, hlA.kS());
        hlA.a(paramVarArgs);
      }
      paramVarArgs.r(6, hiW);
      return 0;
    }
    if (paramInt == 1) {
      if (hLQ == null) {
        break label638;
      }
    }
    label638:
    for (paramInt = a.a.a.a.bJ(1, hLQ.kS()) + 0;; paramInt = 0)
    {
      int i = paramInt + a.a.a.a.bI(2, hiN) + a.a.a.a.bI(3, hjV) + a.a.a.a.bI(4, hjW);
      paramInt = i;
      if (hlA != null) {
        paramInt = i + a.a.a.a.bJ(5, hlA.kS());
      }
      return paramInt + a.a.a.a.q(6, hiW);
      if (paramInt == 2)
      {
        paramVarArgs = new a.a.a.a.a((byte[])paramVarArgs[0], hfZ);
        for (paramInt = adm.a(paramVarArgs); paramInt > 0; paramInt = adm.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.aVo();
          }
        }
        if (hLQ == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (hlA != null) {
          break;
        }
        throw new b("Not all required fields were included: Data");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (a.a.a.a.a)paramVarArgs[0];
        ir localir = (ir)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((a.a.a.a.a)localObject1).pL(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ck();
            localObject2 = new a.a.a.a.a((byte[])localObject2, hfZ);
            for (bool = true; bool; bool = ((ck)localObject1).a((a.a.a.a.a)localObject2, (com.tencent.mm.al.a)localObject1, adm.a((a.a.a.a.a)localObject2))) {}
            hLQ = ((ck)localObject1);
            paramInt += 1;
          }
        case 2: 
          hiN = jMD.aVp();
          return 0;
        case 3: 
          hjV = jMD.aVp();
          return 0;
        case 4: 
          hjW = jMD.aVp();
          return 0;
        case 5: 
          paramVarArgs = ((a.a.a.a.a)localObject1).pL(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new adt();
            localObject2 = new a.a.a.a.a((byte[])localObject2, hfZ);
            for (bool = true; bool; bool = ((adt)localObject1).a((a.a.a.a.a)localObject2, (com.tencent.mm.al.a)localObject1, adm.a((a.a.a.a.a)localObject2))) {}
            hlA = ((adt)localObject1);
            paramInt += 1;
          }
        }
        hiW = jMD.aVq();
        return 0;
      }
      return -1;
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.protocal.b.ir
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */