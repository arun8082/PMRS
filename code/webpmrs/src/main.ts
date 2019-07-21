import { enableProdMode } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { HeaderModule } from './appheader/header.module';
import { NavModule } from './appnav/nav.module';
import { AppModule } from './app/app.module';
import { FooterModule } from './appfooter/footer.module';
import { environment } from './environments/environment';
import 'hammerjs';

if (environment.production) {
  enableProdMode();
}

platformBrowserDynamic().bootstrapModule(HeaderModule)
  .catch(err => console.error(err));

  platformBrowserDynamic().bootstrapModule(NavModule)
  .catch(err => console.error(err));
  
platformBrowserDynamic().bootstrapModule(AppModule)
  .catch(err => console.error(err));

  platformBrowserDynamic().bootstrapModule(FooterModule)
  .catch(err => console.error(err));