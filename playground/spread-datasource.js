$("#spreadsheet").kendoSpreadsheet();

var spreadsheet = $("#spreadsheet").data("kendoSpreadsheet");

var sheet = spreadsheet.activeSheet();

var crudServiceBaseUrl = "//demos.telerik.com/kendo-ui/service";

var dataSource = new kendo.data.DataSource({
    transport: {
        read:  {
            url: crudServiceBaseUrl + "/Products",
            dataType: "jsonp"
        },
        update: {
            url: crudServiceBaseUrl + "/Products/Update",
            dataType: "jsonp"
        },
        destroy: {
            url: crudServiceBaseUrl + "/Products/Destroy",
            dataType: "jsonp"
        },
        create: {
            url: crudServiceBaseUrl + "/Products/Create",
            dataType: "jsonp"
        },
        parameterMap: function(options, operation) {
            if (operation !== "read" && options.models) {
                return {models: kendo.stringify(options.models)};
            }
        }
    },
/*    schema: {
        model: {
            id: "ProductID",
            fields: {
                ProductID: { editable: false, nullable: true },
                ProductName: { validation: { required: true } },
                UnitPrice: { type: "number", validation: { required: true, min: 1} },
                Discontinued: { type: "boolean" },
                UnitsInStock: { type: "number", validation: { min: 0, required: true } }
            }
        }
    }*/
});

sheet.setDataSource(dataSource);

$("#delete").click(function() {
    var cell = sheet.activeCell();
    sheet.deleteRow(cell.topLeft.row);
});

$("#insert").click(function() {
    var cell = sheet.activeCell();
    sheet.insertRow(cell.topLeft.row);
});
