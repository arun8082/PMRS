import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProjectregisterComponent } from './projectregister.component';

describe('ProjectregisterComponent', () => {
  let component: ProjectregisterComponent;
  let fixture: ComponentFixture<ProjectregisterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProjectregisterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProjectregisterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
