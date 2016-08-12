using Kendo.Mvc.Extensions;
using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Kendo.Mvc.UI
{
    /// <summary>
    /// Kendo UI ChartYAxisNotesLineSettings class
    /// </summary>
    public partial class ChartYAxisNotesLineSettings<T> where T : class 
    {
        public double? Width { get; set; }

        public string Color { get; set; }

        public double? Length { get; set; }


        public Chart<T> Chart { get; set; }

        protected Dictionary<string, object> SerializeSettings()
        {
            var settings = new Dictionary<string, object>();

            if (Width.HasValue)
            {
                settings["width"] = Width;
            }

            if (Color?.HasValue() == true)
            {
                settings["color"] = Color;
            }

            if (Length.HasValue)
            {
                settings["length"] = Length;
            }

            return settings;
        }
    }
}