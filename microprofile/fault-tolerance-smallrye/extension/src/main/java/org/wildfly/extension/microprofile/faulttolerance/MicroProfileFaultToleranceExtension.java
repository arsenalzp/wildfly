/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2019, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.wildfly.extension.microprofile.faulttolerance;

import org.jboss.as.clustering.controller.SubsystemExtension;
import org.jboss.as.clustering.controller.descriptions.SubsystemResourceDescriptionResolver;

/**
 * Extension that registers the microprofile fault tolerance subsystem
 * @author Radoslav Husar
 */
public class MicroProfileFaultToleranceExtension extends SubsystemExtension<MicroProfileFaultToleranceSchema> {

    static final String SUBSYSTEM_NAME = "microprofile-fault-tolerance-smallrye";
    static final SubsystemResourceDescriptionResolver SUBSYSTEM_RESOLVER = new SubsystemResourceDescriptionResolver(SUBSYSTEM_NAME, MicroProfileFaultToleranceExtension.class);

    public MicroProfileFaultToleranceExtension() {
        super(SUBSYSTEM_NAME, MicroProfileFaultToleranceModel.CURRENT, MicroProfileFaultToleranceResourceDefinition::new, MicroProfileFaultToleranceSchema.CURRENT, new MicroProfileFaultToleranceXMLDescriptionFactory());
    }
}
