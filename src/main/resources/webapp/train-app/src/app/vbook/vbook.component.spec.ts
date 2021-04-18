import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VbookComponent } from './vbook.component';

describe('VbookComponent', () => {
  let component: VbookComponent;
  let fixture: ComponentFixture<VbookComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VbookComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VbookComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
