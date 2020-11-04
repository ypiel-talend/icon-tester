package org.talend.components.test.icons.withpng.config;

import java.io.Serializable;

import org.talend.sdk.component.api.configuration.Option;
import org.talend.sdk.component.api.configuration.type.DataSet;
import org.talend.sdk.component.api.configuration.ui.layout.GridLayout;
import org.talend.sdk.component.api.meta.Documentation;

@DataSet("DSEWithPng")
@GridLayout({
    // the generated layout put one configuration entry per line,
    // customize it as much as needed
    @GridLayout.Row({ "datastore" })
})
@Documentation("TODO fill the documentation for this configuration")
public class DSEWithPng implements Serializable {
    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private DSOWithPng datastore;

    public DSOWithPng getDatastore() {
        return datastore;
    }

    public DSEWithPng setDatastore(DSOWithPng datastore) {
        this.datastore = datastore;
        return this;
    }
}