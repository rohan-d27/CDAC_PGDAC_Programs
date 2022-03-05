﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GraphicsLib
{
    public interface IPrintable
    {
        string printToPaper();
        string printToScreen();
        string printToHoloGraphicDevice();
    }

   
}
