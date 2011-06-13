/**
 *
 */
package org.jboss.as.domain.controller;

import org.jboss.as.controller.client.NewModelControllerClient;
import org.jboss.msc.service.ServiceName;

/**
 * Client for interacting with the master {@link DomainController} on a remote host.
 *
 * @author Brian Stansberry (c) 2011 Red Hat Inc.
 */
public interface NewMasterDomainControllerClient extends NewModelControllerClient {

    /** Standard service name to use for a service that returns a MasterDomainControllerClient */
    ServiceName SERVICE_NAME = ServiceName.JBOSS.append("domain", "controller", "connection");

    /**
     * Register with the remote domain controller
     *
     * @throws IllegalStateException if there was a problem talking to the remote host
     */
    void register();

    /**
     * Unregister with the remote domain controller.
     */
    void unregister();

    /**
     * Gets a {@link FileRepository} capable of retrieving files from the
     * master domain controller.
     *
     * @return the file repository
     */
    FileRepository getRemoteFileRepository();
}
