/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
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
package com.xwiki.antivirus;

import org.xwiki.component.annotation.Role;

import com.xpn.xwiki.doc.XWikiAttachment;

/**
 * Antivirus engine, in charge of the actual scanning attachments.
 *
 * @version $Id$
 */
@Role
public interface AntivirusEngine
{
    /**
     * @param attachment the attachment to scan
     * @return the result of the scan
     * @throws AntivirusException in case of problems
     */
    ScanResult scan(XWikiAttachment attachment) throws AntivirusException;
}
