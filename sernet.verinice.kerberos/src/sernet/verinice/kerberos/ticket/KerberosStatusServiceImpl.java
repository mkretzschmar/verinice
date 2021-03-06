/*******************************************************************************
 * Copyright (c) 2015 verinice.
 *
 * This program is free software: you can redistribute it and/or 
 * modify it under the terms of the GNU Lesser General Public License 
 * as published by the Free Software Foundation, either version 3 
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,    
 * but WITHOUT ANY WARRANTY; without even the implied warranty 
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. 
 * If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors:
 *     verinice <bw[at]sernet[dot]de> - initial API and implementation
 ******************************************************************************/
package sernet.verinice.kerberos.ticket;

import sernet.verinice.kerberos.Activator;
import sernet.verinice.kerberos.preferences.PreferenceConstants;
import sernet.verinice.service.auth.KerberosStatusService;

/**
 * @author Benjamin Weißenfels <bw[at]sernet[dot]de>
 *
 */
public class KerberosStatusServiceImpl implements KerberosStatusService {

    @Override
    public boolean isActive() {
        return Activator.getDefault().getPreferenceStore().getBoolean(PreferenceConstants.KERBEROS_STATUS);
    }

}
