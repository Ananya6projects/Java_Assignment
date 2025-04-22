package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.external.ConnectorUser;
import com.xworkz.abstraction.internal.Connector;
import com.xworkz.abstraction.internal.ConnectorImpl;

public class ConnectorRunner {
    public static void main(String[] args) {
        Connector connector=new ConnectorImpl();
        ConnectorUser connectorUser=new ConnectorUser(connector);
        connectorUser.execute();
    }
}
