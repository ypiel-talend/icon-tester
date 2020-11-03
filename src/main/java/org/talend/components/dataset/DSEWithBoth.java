package org.talend.components.dataset;

import java.io.Serializable;

import org.talend.components.datastore.DSOWithBoth;

import org.talend.sdk.component.api.configuration.Option;
import org.talend.sdk.component.api.configuration.type.DataSet;
import org.talend.sdk.component.api.configuration.ui.layout.GridLayout;
import org.talend.sdk.component.api.meta.Documentation;

@DataSet("DSEWithBoth")
@GridLayout({
    // the generated layout put one configuration entry per line,
    // customize it as much as needed
    @GridLayout.Row({ "datastore" })
})
@Documentation("TODO fill the documentation for this configuration")
public class DSEWithBoth implements Serializable {
    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private DSOWithBoth datastore;

    public DSOWithBoth getDatastore() {
        return datastore;
    }

    public DSEWithBoth setDatastore(DSOWithBoth datastore) {
        this.datastore = datastore;
        return this;
    }
}