package org.talend.components.test.icons.withsvg.config;

import java.io.Serializable;

import org.talend.sdk.component.api.configuration.Option;
import org.talend.sdk.component.api.configuration.type.DataSet;
import org.talend.sdk.component.api.configuration.ui.layout.GridLayout;
import org.talend.sdk.component.api.meta.Documentation;

@DataSet("DSEWithSvg")
@GridLayout({
    // the generated layout put one configuration entry per line,
    // customize it as much as needed
    @GridLayout.Row({ "datastore" })
})
@Documentation("TODO fill the documentation for this configuration")
public class DSEWithSvg implements Serializable {
    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private DSOWithSvg datastore;

    public DSOWithSvg getDatastore() {
        return datastore;
    }

    public DSEWithSvg setDatastore(DSOWithSvg datastore) {
        this.datastore = datastore;
        return this;
    }
}