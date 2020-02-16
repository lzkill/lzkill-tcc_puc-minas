import { Routes } from '@angular/router';

import { SgqRelatorioComponent } from './sgq-relatorio-component';
import { UserRouteAccessService } from 'app/core/auth/user-route-access-service';

export const reportRoute: Routes = [
  {
    path: '',
    component: SgqRelatorioComponent,
    data: {
      authorities: ['ROLE_USER'],
      pageTitle: 'gatewayApp.sgqAnexo.home.title'
    },
    canActivate: [UserRouteAccessService]
  }
];
